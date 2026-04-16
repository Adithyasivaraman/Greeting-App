package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private IGreetingService greetingService;

    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    @PutMapping("/{id}")
    public Greeting updateGreeting(
            @PathVariable Long id,
            @RequestParam String message) {

        return greetingService.updateGreeting(id, message);
    }

    @DeleteMapping("/{id}")
    public Greeting deleteGreeting(@PathVariable Long id) {
        return greetingService.deleteGreeting(id);
    }
}