package com.springwebapp.springwebapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("anotherImpl")
@Service("baseGreetingService")
public class GreetingServiceAnotherImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi from another baseService";
    }
}
