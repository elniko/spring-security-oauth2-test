package com.example.testresourceservice.stet.api;

import com.example.testresourceservice.stet.model.HalPaymentRequest;
import com.example.testresourceservice.stet.model.HalPaymentTransferRequestCreation;
import com.example.testresourceservice.stet.model.PaymentRequestResource;
import com.example.testresourceservice.stet.model.PaymentTransferRequestConfirmationResource;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

@Controller
public class PaymentRequestsApiController implements PaymentRequestsApi {



    public ResponseEntity<HalPaymentRequest> paymentRequestConfirmationPost(@ApiParam(value = "Access token to be passed as a header" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
                                                                            @ApiParam(value = "Identification of the Payment Request Resource",required=true ) @PathVariable("paymentRequestResourceId") String paymentRequestResourceId,
                                                                            @ApiParam(value = "http-signature of the request (cf. https://datatracker.ietf.org/doc/draft-cavage-http-signatures/) The keyId part of the header should be formatted as follows   keiId=\"SN=XXX,CA=YYYYYYYYYYYYYYYY\" where   \"XXX\" is the serial number, in hexadecimal without any prefix (like 0x), of the QSEAL certificate whose relevant private key was used for signing   \"YYYYYYYYYYYYYYYY\" is the the Issuer DN, full Distinguished Name of the Certification Authority having issued this certificate HTTP400 will be returned by the server in case of invalid or absent signature " ,required=true) @RequestHeader(value="Signature", required=true) String signature,
                                                                            @ApiParam(value = "Correlation header to be set in a request and retrieved in the relevant response " ,required=true) @RequestHeader(value="X-Request-ID", required=true) String xRequestID,
                                                                            @ApiParam(value = "parameters needed for confirmation of the Payment or Transfer Request, especially in EMBEDDED approach"  )  @Valid @RequestBody PaymentTransferRequestConfirmationResource confirmationRequest,
                                                                            @ApiParam(value = "IP address used by the PSU's terminal when connecting to the TPP" ) @RequestHeader(value="PSU-IP-Address", required=false) String psUIPAddress,
                                                                            @ApiParam(value = "IP port used by the PSU's terminal when connecting to the TPP" ) @RequestHeader(value="PSU-IP-Port", required=false) String psUIPPort,
                                                                            @ApiParam(value = "Http method for the most relevant PSUâ€™s terminal request to the TTP" ) @RequestHeader(value="PSU-HTTP-Method", required=false) String psUHTTPMethod,
                                                                            @ApiParam(value = "Timestamp of the most relevant PSUâ€™s terminal request to the TTP" ) @RequestHeader(value="PSU-Date", required=false) String psUDate,
                                                                            @ApiParam(value = "Geographical location of the PSU as provided by the PSU mobile terminal if any to the TPP" ) @RequestHeader(value="PSU-GEO-Location", required=false) String psUGEOLocation,
                                                                            @ApiParam(value = "\"User-Agent\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-User-Agent", required=false) String psUUserAgent,
                                                                            @ApiParam(value = "\"Referer\" header field sent by the PSU terminal when connecting to the TPP. Notice that an initial typo in RFC 1945 specifies that \"referer\" (incorrect spelling) is to be used. The correct spelling \"referrer\" can be used but might not be understood. " ) @RequestHeader(value="PSU-Referer", required=false) String psUReferer,
                                                                            @ApiParam(value = "\"Accept\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-Accept", required=false) String psUAccept,
                                                                            @ApiParam(value = "\"Accept-Charset\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-Accept-Charset", required=false) String psUAcceptCharset,
                                                                            @ApiParam(value = "\"Accept-Encoding\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-Accept-Encoding", required=false) String psUAcceptEncoding,
                                                                            @ApiParam(value = "\"Accept-Language\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-Accept-Language", required=false) String psUAcceptLanguage,
                                                                            @ApiParam(value = "Digest of the body" ) @RequestHeader(value="Digest", required=false) String digest) {
        // do some magic!
        return new ResponseEntity<HalPaymentRequest>(HttpStatus.OK);
    }

    public ResponseEntity<HalPaymentRequest> paymentRequestsGet(@ApiParam(value = "Access token to be passed as a header" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
                                                                @ApiParam(value = "Identification of the Payment Request Resource",required=true ) @PathVariable("paymentRequestResourceId") String paymentRequestResourceId,
                                                                @ApiParam(value = "http-signature of the request (cf. https://datatracker.ietf.org/doc/draft-cavage-http-signatures/) The keyId part of the header should be formatted as follows   keiId=\"SN=XXX,CA=YYYYYYYYYYYYYYYY\" where   \"XXX\" is the serial number, in hexadecimal without any prefix (like 0x), of the QSEAL certificate whose relevant private key was used for signing   \"YYYYYYYYYYYYYYYY\" is the the Issuer DN, full Distinguished Name of the Certification Authority having issued this certificate HTTP400 will be returned by the server in case of invalid or absent signature " ,required=true) @RequestHeader(value="Signature", required=true) String signature,
                                                                @ApiParam(value = "Correlation header to be set in a request and retrieved in the relevant response " ,required=true) @RequestHeader(value="X-Request-ID", required=true) String xRequestID,
                                                                @ApiParam(value = "IP address used by the PSU's terminal when connecting to the TPP" ) @RequestHeader(value="PSU-IP-Address", required=false) String psUIPAddress,
                                                                @ApiParam(value = "IP port used by the PSU's terminal when connecting to the TPP" ) @RequestHeader(value="PSU-IP-Port", required=false) String psUIPPort,
                                                                @ApiParam(value = "Http method for the most relevant PSUâ€™s terminal request to the TTP" ) @RequestHeader(value="PSU-HTTP-Method", required=false) String psUHTTPMethod,
                                                                @ApiParam(value = "Timestamp of the most relevant PSUâ€™s terminal request to the TTP" ) @RequestHeader(value="PSU-Date", required=false) String psUDate,
                                                                @ApiParam(value = "Geographical location of the PSU as provided by the PSU mobile terminal if any to the TPP" ) @RequestHeader(value="PSU-GEO-Location", required=false) String psUGEOLocation,
                                                                @ApiParam(value = "\"User-Agent\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-User-Agent", required=false) String psUUserAgent,
                                                                @ApiParam(value = "\"Referer\" header field sent by the PSU terminal when connecting to the TPP. Notice that an initial typo in RFC 1945 specifies that \"referer\" (incorrect spelling) is to be used. The correct spelling \"referrer\" can be used but might not be understood. " ) @RequestHeader(value="PSU-Referer", required=false) String psUReferer,
                                                                @ApiParam(value = "\"Accept\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-Accept", required=false) String psUAccept,
                                                                @ApiParam(value = "\"Accept-Charset\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-Accept-Charset", required=false) String psUAcceptCharset,
                                                                @ApiParam(value = "\"Accept-Encoding\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-Accept-Encoding", required=false) String psUAcceptEncoding,
                                                                @ApiParam(value = "\"Accept-Language\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-Accept-Language", required=false) String psUAcceptLanguage,
                                                                @ApiParam(value = "Digest of the body" ) @RequestHeader(value="Digest", required=false) String digest) {
        // do some magic!
        return new ResponseEntity<HalPaymentRequest>(HttpStatus.OK);
    }

    public ResponseEntity<HalPaymentTransferRequestCreation> paymentRequestsPost(@ApiParam(value = "Access token to be passed as a header" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
                                                                                 @ApiParam(value = "ISO20022 based payment Initiation Request" ,required=true )  @Valid @RequestBody PaymentRequestResource paymentRequest,
                                                                                 @ApiParam(value = "http-signature of the request (cf. https://datatracker.ietf.org/doc/draft-cavage-http-signatures/) The keyId part of the header should be formatted as follows   keiId=\"SN=XXX,CA=YYYYYYYYYYYYYYYY\" where   \"XXX\" is the serial number, in hexadecimal without any prefix (like 0x), of the QSEAL certificate whose relevant private key was used for signing   \"YYYYYYYYYYYYYYYY\" is the the Issuer DN, full Distinguished Name of the Certification Authority having issued this certificate HTTP400 will be returned by the server in case of invalid or absent signature " ,required=true) @RequestHeader(value="Signature", required=true) String signature,
                                                                                 @ApiParam(value = "Correlation header to be set in a request and retrieved in the relevant response " ,required=true) @RequestHeader(value="X-Request-ID", required=true) String xRequestID,
                                                                                 @ApiParam(value = "IP address used by the PSU's terminal when connecting to the TPP" ) @RequestHeader(value="PSU-IP-Address", required=false) String psUIPAddress,
                                                                                 @ApiParam(value = "IP port used by the PSU's terminal when connecting to the TPP" ) @RequestHeader(value="PSU-IP-Port", required=false) String psUIPPort,
                                                                                 @ApiParam(value = "Http method for the most relevant PSUâ€™s terminal request to the TTP" ) @RequestHeader(value="PSU-HTTP-Method", required=false) String psUHTTPMethod,
                                                                                 @ApiParam(value = "Timestamp of the most relevant PSUâ€™s terminal request to the TTP" ) @RequestHeader(value="PSU-Date", required=false) String psUDate,
                                                                                 @ApiParam(value = "Geographical location of the PSU as provided by the PSU mobile terminal if any to the TPP" ) @RequestHeader(value="PSU-GEO-Location", required=false) String psUGEOLocation,
                                                                                 @ApiParam(value = "\"User-Agent\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-User-Agent", required=false) String psUUserAgent,
                                                                                 @ApiParam(value = "\"Referer\" header field sent by the PSU terminal when connecting to the TPP. Notice that an initial typo in RFC 1945 specifies that \"referer\" (incorrect spelling) is to be used. The correct spelling \"referrer\" can be used but might not be understood. " ) @RequestHeader(value="PSU-Referer", required=false) String psUReferer,
                                                                                 @ApiParam(value = "\"Accept\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-Accept", required=false) String psUAccept,
                                                                                 @ApiParam(value = "\"Accept-Charset\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-Accept-Charset", required=false) String psUAcceptCharset,
                                                                                 @ApiParam(value = "\"Accept-Encoding\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-Accept-Encoding", required=false) String psUAcceptEncoding,
                                                                                 @ApiParam(value = "\"Accept-Language\" header field sent by the PSU terminal when connecting to the TPP " ) @RequestHeader(value="PSU-Accept-Language", required=false) String psUAcceptLanguage,
                                                                                 @ApiParam(value = "Digest of the body" ) @RequestHeader(value="Digest", required=false) String digest) {
        // do some magic!
        return new ResponseEntity<HalPaymentTransferRequestCreation>(HttpStatus.OK);
    }

}
