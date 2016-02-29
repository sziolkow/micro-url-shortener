package org.home.sziolkow.microservice.management.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceSearchRestController {

    @RequestMapping("/search")
    public String ItemList() {
        return "not implemented yet";
    }
}
