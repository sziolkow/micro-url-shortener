package org.home.sziolkow.microservice.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class UrlShortenerConfigurationService {

    public static void main(String[] args) {
        SpringApplication.run(UrlShortenerConfigurationService.class, args);
    }
}
