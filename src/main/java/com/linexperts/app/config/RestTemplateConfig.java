package com.linexperts.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

/**
 * Configuración de RestTemplate para la aplicación Spring Boot.
 * 
 * Esta clase define un bean de RestTemplate que se puede inyectar en otros 
 * componentes de la aplicación para realizar llamadas HTTP.
 * 
 * @autor ntejada
 */
@Configuration
public class RestTemplateConfig {

    /**
     * Crea y configura una instancia de RestTemplate.
     * 
     * @param builder el constructor de RestTemplate utilizado para configurar la instancia
     * @return una instancia configurada de RestTemplate
     */
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}

