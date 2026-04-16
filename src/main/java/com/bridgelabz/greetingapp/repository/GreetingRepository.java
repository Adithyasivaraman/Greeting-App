package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.model.Greeting;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class GreetingRepository implements IGreetingRepository {

    private Map<Long, Greeting> storage = new HashMap<>();
    private AtomicLong counter = new AtomicLong();

    @Override
    public Greeting save(Greeting greeting) {
        Long id = counter.incrementAndGet();
        greeting.setId(id);
        storage.put(id, greeting);
        return greeting;
    }

    @Override
    public Greeting findById(Long id) {
        return storage.get(id);
    }

    @Override
    public List<Greeting> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Greeting update(Long id, String message) {

        Greeting existing = storage.get(id);

        if (existing == null) {
            return null; // handled in service
        }

        existing.setMessage(message);
        storage.put(id, existing); // overwrite

        return existing;
    }

    @Override
    public Greeting deleteById(Long id) {

        Greeting existing = storage.get(id);

        if (existing == null) {
            return null;
        }

        storage.remove(id);
        return existing;
    }
}