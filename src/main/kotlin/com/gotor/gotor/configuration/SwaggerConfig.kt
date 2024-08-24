package com.gotor.gotor.configuration

import io.swagger.v3.oas.models.ExternalDocumentation
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {
    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Gotor Swagger UI")
                    .description("This is Gotor API Specification")
                    .version("v1.0.0")
                    .contact(Contact().name("API Support").url("http://example.com").email("support@example.com"))
                    .license(License().name("Apache 2.0").url("http://springdoc.org"))
            )
    }
}