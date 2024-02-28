package com.example.application.services;

import com.example.application.model.Attendee;
import com.example.application.model.AttendeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final AttendeeRepository repository;
    public DatabaseLoader(AttendeeRepository repository) {
        this.repository = repository;
    }
    Random random = new Random();
    @Override
    public void run(String... strings) throws Exception {
        for (int i = 1; i <= 10; i++) {
            boolean randomBoolean = random.nextBoolean();
            String email = i + "@example.com";
            repository.save(new Attendee("Attendee " + i, randomBoolean, email));
        }
    }
}
