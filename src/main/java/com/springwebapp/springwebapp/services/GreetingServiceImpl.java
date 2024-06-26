package com.springwebapp.springwebapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("baseImpl")
@Service("baseGreetingService")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hi from base service";
    }
}
