package com.example.learn.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18")
public class I18SpGreeting implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo";
    }
}
