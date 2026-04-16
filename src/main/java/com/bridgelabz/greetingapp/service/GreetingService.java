package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {

    @Autowired
    private IGreetingRepository repository;

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

    @Override
    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting();
        greeting.setMessage(message);
        return repository.save(greeting);
    }

    @Override
    public Greeting getGreetingById(Long id) {
        return repository.findById(id);
    }
}