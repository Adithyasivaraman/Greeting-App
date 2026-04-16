package com.bridgelabz.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {

    @Override
    public String getGreetingMessage() {
        return "Hello World";
    }

    @Override
    public String getCustomGreeting(String firstName, String lastName) {

        if (firstName != null && lastName != null) {
            return "Hello " + firstName + " " + lastName;
        }

        if (firstName != null) {
            return "Hello " + firstName;
        }

        if (lastName != null) {
            return "Hello " + lastName;
        }

        return "Hello World";
    }
}