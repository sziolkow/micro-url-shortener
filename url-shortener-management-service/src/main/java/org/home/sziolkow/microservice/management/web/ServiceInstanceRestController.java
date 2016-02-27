package org.home.sziolkow.microservice.management.web;

import org.home.sziolkow.microservice.management.UrlItem;
import org.home.sziolkow.microservice.management.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceInstanceRestController {

    @Autowired
    private UrlRepository urlRepository;

    @RequestMapping("/list")
    public Iterable<UrlItem> ItemList() {
        Iterable<UrlItem> temp = urlRepository.findAll();
        return temp;
    }
}
