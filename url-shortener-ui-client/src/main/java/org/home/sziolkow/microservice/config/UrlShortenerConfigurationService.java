package org.home.sziolkow.microservice.config;


import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class UrlShortenerConfigurationService {

    @Autowired
    DiscoveryClient discoveryClient;

    public static void main(String[] args) {
        SpringApplication.run(UrlShortenerConfigurationService.class, args);
    }

    @RequestMapping(value = "/discover", method = RequestMethod.GET)
    public ModelAndView serviceUrl() {
        ModelAndView mav = new ModelAndView("discover");
        mav.addObject("search_home_page_url", readServiceUrlHome("shortener-serch-service"));
        mav.addObject("management_home_page_url", readServiceUrlHome("shortener-management-service"));
        return mav;
    }

    private String readServiceUrlHome(String serviceName) {
        InstanceInfo instance = null;
        try {
            instance = discoveryClient.getNextServerFromEureka(serviceName, false);
        } catch (RuntimeException ex) {
            // Stupid, but must be here
        }
        if (instance != null ) {
            return instance.getHomePageUrl();
        }
        return "";
    }

}
