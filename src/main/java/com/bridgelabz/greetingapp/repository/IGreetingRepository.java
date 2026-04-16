package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.model.Greeting;

public interface IGreetingRepository {
    Greeting save(Greeting greeting);
}