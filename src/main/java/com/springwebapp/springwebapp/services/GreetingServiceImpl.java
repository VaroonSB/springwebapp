package com.springwebapp.springwebapp.services;

import org.springframework.stereotype.Service;

@Service("baseGreetingService")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hi from base service";
    }
}
