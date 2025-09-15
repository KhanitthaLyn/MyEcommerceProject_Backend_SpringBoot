package com.ecommerce.myecommerceproject.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        SecurityScheme bearerScheme = new SecurityScheme()
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT")
                .description("JWT Bearer Token");

        SecurityRequirement bearerRequirement = new SecurityRequirement()
                .addList("bearerAuth");
        return new OpenAPI()
                .info(new Info()
                        .title("Spting Boot Ecommerce")
                        .description("Sping Boot for Ecommerce")
                        .license(new License().name("Apache").url("http..."))
                        .contact(new Contact()
                                .name ("Mmemem")
                                .email("Email")
                                .url("https://www.github.com")))
                .externalDocs(new ExternalDocumentation()
                        .description("Spting Boot Ecommerce")
                        .url("https://www.github.com"))
                .components(new Components()
                        .addSecuritySchemes("bearerAuth", bearerScheme))
                        .addSecurityItem(bearerRequirement);
    }
}
