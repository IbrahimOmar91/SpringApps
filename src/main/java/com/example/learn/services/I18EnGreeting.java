package com.example.learn.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18")
public class I18EnGreeting implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
