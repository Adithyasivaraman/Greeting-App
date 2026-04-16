package com.bridgelabz.greetingapp.service;

public interface IGreetingService {
    String getGreetingMessage();
    String getCustomGreeting(String firstName, String lastName);
}