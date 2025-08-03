package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("HOME page handler");
        return "home.html";
    }

    // about route
    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("about page loading....");
        return "about.html";
    }

    // services
    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("services page loading....");
        return "services.html";
    }
}
