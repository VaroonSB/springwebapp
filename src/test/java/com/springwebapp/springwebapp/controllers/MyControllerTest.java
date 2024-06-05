package com.springwebapp.springwebapp.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("anotherImpl")
@SpringBootTest
class MyControllerTest {

    @Autowired
    MyController myController;

    @Test
    void sayHello() {
        System.out.println(myController.sayHello());
    }
}