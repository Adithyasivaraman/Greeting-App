package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import java.util.List;

public interface IGreetingService {
    String getGreetingMessage();
    String getCustomGreeting(String firstName, String lastName);
    Greeting saveGreeting(String message);
    Greeting getGreetingById(Long id);
    List<Greeting> getAllGreetings();   // NEW
    Greeting updateGreeting(Long id, String message);
    Greeting deleteGreeting(Long id);
}