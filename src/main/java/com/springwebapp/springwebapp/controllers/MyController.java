package com.springwebapp.springwebapp.controllers;

import com.springwebapp.springwebapp.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("I'm in controller");

        return greetingService.sayGreeting();
    }
}
