package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;

public interface IGreetingService {
    String getGreetingMessage();
    String getCustomGreeting(String firstName, String lastName);
    Greeting saveGreeting(String message);
    Greeting getGreetingById(Long id);   // NEW
}