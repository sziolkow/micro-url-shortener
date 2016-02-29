package org.home.sziolkow.microservice.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by slawek on 26/02/16.
 */
@ComponentScan
@EnableAutoConfiguration
@EnableDiscoveryClient
@Component
public class UrlShortenerMgmntApp {

    private final UrlRepository urlRepository;

    @Autowired
    public UrlShortenerMgmntApp(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    @PostConstruct
    public void generateTestData() {
        urlRepository.save(new UrlItem("long", "short", "desc"));
        urlRepository.save(new UrlItem("long2", "short2", "desc2"));
    }

    public static void main(String[] args) {
        SpringApplication.run(UrlShortenerMgmntApp.class, args);
    }
}
