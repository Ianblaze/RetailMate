package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI smartStoreOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("RetailMate POS API")
                        .description("Professional Point of Sale System API for managing Sales, Inventory, and Analytics.")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("RetailMate Support")
                                .email("admin@retailmate.com")
                                .url("https://retailmate.app"))
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}