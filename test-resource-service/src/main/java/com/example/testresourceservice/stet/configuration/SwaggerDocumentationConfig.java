package com.example.testresourceservice.stet.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

//@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("PSD2 ASPSP services for AISP, PISP and PIISP.")
            .description("This API intends to provide an interface between - Account Servicing Payment Service Providers (ASPSP) - Third Party (Payment Service) Providers (TPP)  TPP may act with different roles as described below: - Account Information Service Providers (AISP) - Payment Initiation Service Providers (PISP) - Payment Instrument Issuer Service Providers (PIISP)  The Payment Service User (PSU) is the owner of the accounts held by the ASPSP and gives accreditations to the TPP in order to access his accounts information or initiates payment from these accounts  The API is designed on a REST model using JSON structures.  The Richardson Maturity Model is applied on level three using HAL HYPERMEDIA links ")
            .license("Creative Commons Attribution 3.0 France (CC BY 3.0 FR)")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("https://www.stet.eu/en/psd2/")
            .version("1.3.0")
            .contact(new Contact("","", "psd2@stet.eu"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
