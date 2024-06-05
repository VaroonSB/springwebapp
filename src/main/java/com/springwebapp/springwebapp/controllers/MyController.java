package com.springwebapp.springwebapp.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("I'm in controller");

        return "Hello everyone";
    }
}
