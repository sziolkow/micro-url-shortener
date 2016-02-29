package org.home.sziolkow.microservice.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by slawek on 26/02/16.
 */
@ComponentScan
@EnableAutoConfiguration
@EnableDiscoveryClient
@Component
public class UrlShortenerSearchApp {

    public static void main(String[] args) {
        SpringApplication.run(UrlShortenerSearchApp.class, args);
    }
}
