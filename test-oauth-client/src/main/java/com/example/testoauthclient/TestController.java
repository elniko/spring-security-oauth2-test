package com.example.testoauthclient;

import com.example.testoauthclient.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.web.authentication.logout.CookieClearingLogoutHandler;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.security.web.authentication.rememberme.AbstractRememberMeServices;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.HashMap;
import java.util.UUID;

import static com.example.testoauthclient.model.StatusReasonInformation.FF01;
import static com.example.testoauthclient.model.TransactionIndividualStatusCode.RJCT;

@RestController
@RequestMapping("/api")
public class TestController {

    private static String BASE_URL= "http://192.19.160.241:8281/rs/V1.0";
    //private static String BASE_URL= "http://localhost:8083";


    @Autowired
    CurrentUser currentUser;

    @Autowired
    OAuth2RestTemplate restTemplate;

    @Value("${security.oauth2.client.clientId}")
    private String clientId;

    @Value("${security.oauth2.client.clientSecret}")
    private String clientSecret;

    //@PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping(value = "/getAccounts", produces = "application/json")
    public String getAccounts() {
      //  restTemplate.getAccessToken().getValue();
        HttpHeaders headers = new HttpHeaders();
       // headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("PSU-Account-Consent-Responsibility", "BY-AISP");
        headers.set("Signature", "SN=XXX,CA=YYYYYYYYYYYYYYYY");
        headers.set("X-Request-ID", "lol");
        HttpEntity he = new HttpEntity(headers);
        return restTemplate.exchange(BASE_URL +"/accounts", HttpMethod.GET, he, String.class).getBody();
        //return restTemplate.getForEntity("https://localhost:8083/accounts", String.class).getBody();
    }

    @GetMapping("/login")
    public String login() {
        return restTemplate.getAccessToken().getValue();
    }

    @GetMapping(value = "/callback")
    public RedirectView callback(Session session) {
       // System.out.println(restTemplate.getAccessToken().getValue());
        return new RedirectView("http://localhost:4200/");
    }

    @GetMapping("/test")
    public String test(HttpServletRequest req)
    {

        return "Test test test";
    }



    @GetMapping("/logoutSuccess")
    public String loggedOut() {
        return "Logged out";
    }

    @GetMapping("/logout")
    public void logout(boolean full) throws UnsupportedEncodingException {
        if(full) {
            restTemplate.getForObject(BASE_URL+"/logoutLink", String.class);
        }

       // currentUser.resetUser();
        String accessToken = restTemplate.getAccessToken().getValue();
        String revokeLink = "https://localhost:9444/oauth2/revoke";
        RestTemplate rt = new RestTemplate();
        MultiValueMap<String, String> formData = new LinkedMultiValueMap();
        formData.add("token", accessToken);
        formData.add("token_type_hint" , "access_token");
        HttpHeaders headers = new HttpHeaders();
        String creds = clientId+":"+clientSecret;
        headers.set("Authorization", "Basic " + new String(Base64.getEncoder().encode(creds.getBytes("UTF-8"))));
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        rt.exchange(revokeLink, HttpMethod.POST, new HttpEntity(formData, headers), String.class);
        clearToken();
    }

    @RequestMapping("/logoutOnServer")
    public void logoutOnServer() {
        restTemplate.getForObject("https://localhost:8083/", Object.class);
    }

    @RequestMapping(value = "/currentUser",method = {RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.GET},produces = "application/json")
    public UserDetailsOzone currentUser() {
        return currentUser.getCurrentUser();
    }

    @GetMapping(value = "/activeUsers", produces = "application/json")
    public String currentUsers() {
        return restTemplate.exchange(BASE_URL+ "/users", HttpMethod.GET, null, String.class).getBody();
    }
    @GetMapping("/redirect")
    public RedirectView redirect() {
        return new RedirectView("https://localhost:9444/oauth2/authorize?client_id=woeflPJTVvKBry_sn9tw9D_R4fEa&redirect_uri=http://localhost:8084/api/callback&response_type=code&scope=openid&prompt=login" );
        //return new RedirectView("https://localhost:9443/oauth2/authorize?client_id=Dvk24w_3H_yyMKtngwgBvaT3rmka&redirect_uri=http://localhost:8084/api/callback&response_type=code&scope=openid&prompt=login" );
    }

    @GetMapping("/redirectLogout")
    public RedirectView redirectLogout() {
        return new RedirectView("https://localhost:9444/oidc/logout?post_logout_redirect_uri=http://localhost:8084/api/callback");
    }

    @GetMapping("/clearToken")
    public void clearToken() {
        restTemplate.getOAuth2ClientContext().setAccessToken(null);
        restTemplate.getOAuth2ClientContext().getAccessTokenRequest().setAuthorizationCode(null);
        restTemplate.getOAuth2ClientContext().getAccessTokenRequest().clear();
    }



    @PostMapping(value="/payment", produces = "application/json")
    public  ResponseEntity<String> paymentRequest(@RequestBody PaymentBodyWrapper body, HttpServletRequest request) throws UnsupportedEncodingException {

        HttpSession session = request.getSession(false);

        System.out.println(session.getAttribute("client"));
        session.setAttribute("client", "client");


        AmountType amount =  body.getAmount();

        PartyIdentification creditor = new PartyIdentification();
        PartyIdentification debtor = new PartyIdentification();

        AccountIdentification creditorAccount =  body.getCreditor();
        AccountIdentification debtorAccount = body.getDebtor().getAccountId();


        CreditTransferTransaction transaction = new CreditTransferTransaction();

        transaction.setPaymentId(
                new PaymentIdentification()
                .instructionId(UUID.randomUUID().toString())
                .resourceId(UUID.randomUUID().toString())
                .endToEndId(UUID.randomUUID().toString())
        );
        transaction.setInstructedAmount(amount);


        transaction.regulatoryReportingCode("lol");
        transaction.setRequestedExecutionDate(LocalDateTime.now());
        transaction.setTransactionStatus(RJCT);
        transaction.setStatusReasonInformation(FF01);

        PaymentRequestResource paymentResource = new PaymentRequestResource();
        paymentResource.addCreditTransferTransactionItem(transaction);
        paymentResource.setCreditorAccount(creditorAccount);
        paymentResource.setDebtorAccount(debtorAccount);
        paymentResource.setNumberOfTransactions(1);

        paymentResource.setPurpose(PurposeCode.ACCT);
        paymentResource.setStatusReasonInformation(StatusReasonInformation.FF01);


        HttpHeaders headers = new HttpHeaders();
        // headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("PSU-Account-Consent-Responsibility", "BY-AISP");
        headers.set("Signature", "SN=XXX,CA=YYYYYYYYYYYYYYYY");
        headers.set("X-Request-ID", "lol");

        //logout();
        //UserDetailsOzone currentUser = this.currentUser.getCurrentUser();
        ResponseEntity<String> exchange;
        try {
           exchange = restTemplate.exchange(BASE_URL+"/payment-requests", HttpMethod.POST, new HttpEntity(paymentResource, headers), String.class);
        } catch(HttpClientErrorException ex) {
            if(ex.getStatusCode() == HttpStatus.UNAUTHORIZED) {
                logout(false);
               return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
               // exchange = restTemplate.exchange("https://localhost:8083/payment-requests", HttpMethod.POST, new HttpEntity(paymentResource, headers), String.class);
            }
            exchange = new ResponseEntity<>(ex.getStatusCode());
        }

        return exchange;

    }

    @ExceptionHandler(HttpClientErrorException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String httpClientErrorExceptionHandler(HttpClientErrorException ex) {
        return ex.getResponseBodyAsString();
    }


}
