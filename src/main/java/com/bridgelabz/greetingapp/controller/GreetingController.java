package com.bridgelabz.greetingapp.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // GET → Simple Hello
    @GetMapping
    public Map<String, String> getGreeting() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello World");
        return response;
    }

    // POST → Custom message via request param
    @PostMapping
    public Map<String, String> postGreeting(@RequestParam(defaultValue = "World") String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello " + name);
        return response;
    }

    // PUT → Update message
    @PutMapping("/{name}")
    public Map<String, String> putGreeting(@PathVariable String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Updated Hello " + name);
        return response;
    }

    // DELETE → Simulated delete
    @DeleteMapping("/{name}")
    public Map<String, String> deleteGreeting(@PathVariable String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Deleted greeting for " + name);
        return response;
    }
}