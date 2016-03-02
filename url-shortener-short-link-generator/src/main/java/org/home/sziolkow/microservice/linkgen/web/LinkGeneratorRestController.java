package org.home.sziolkow.microservice.linkgen.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkGeneratorRestController {

    @RequestMapping("/generate")
    public String ItemList() {
        return "not implemented yet";
    }
}
