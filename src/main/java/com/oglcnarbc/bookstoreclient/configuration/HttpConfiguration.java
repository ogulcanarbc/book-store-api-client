package com.oglcnarbc.bookstoreclient.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpConfiguration {

    @Bean
    @LoadBalanced //eureka ya gitmesi için
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
