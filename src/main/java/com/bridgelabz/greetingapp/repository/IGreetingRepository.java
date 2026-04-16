package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.model.Greeting;
import java.util.List;

public interface IGreetingRepository {
    Greeting save(Greeting greeting);
    Greeting findById(Long id);
    List<Greeting> findAll();
    Greeting update(Long id, String message);   // NEW
}