package ch.inss.springapichallenge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Petstore, the troublemaker of OpenAPI 3.0")
                                .description("Some sample APIs collected by International Network Support & Service - Glas. This document contains endpoints containing APIs that don't have only common formats like application/json, but more uncommon but standard formats like float numbers and special characters like german Umlaute. This is to test & check if a tool can handle also those formats.")
                                .termsOfService("http://inss.ch")
                                .contact(
                                        new Contact()
                                                .email("info@inss.ch")
                                )
                                .license(
                                        new License()
                                                .name("Apache 2.0")
                                                .url("http://www.apache.org/licenses/LICENSE-2.0.html")
                                )
                                .version("1.0.1")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("api_key", new SecurityScheme()
                                        .type(SecurityScheme.Type.APIKEY)
                                        .in(SecurityScheme.In.HEADER)
                                        .name("api_key")
                                )
                                .addSecuritySchemes("petstore_auth", new SecurityScheme()
                                        .type(SecurityScheme.Type.OAUTH2)
                                )
                )
        ;
    }
}