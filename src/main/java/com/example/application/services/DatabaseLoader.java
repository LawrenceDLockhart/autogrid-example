package com.example.application.services;

import com.example.application.model.Attendee;
import com.example.application.model.AttendeeRepository;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final AttendeeRepository repository;
    DataFactory dataFactory = new DataFactory();
    public DatabaseLoader(AttendeeRepository repository) {
        this.repository = repository;
    }
    Random random = new Random();
    @Override
    public void run(String... strings) throws Exception {
        for (int i = 1; i <= 10; i++) {
            String name = dataFactory.getFirstName() + dataFactory.getLastName();
            boolean randomBoolean = random.nextBoolean();
            String email = i + "@example.com";
            repository.save(new Attendee(name, randomBoolean, name+"@gmail.com"));
        }
    }
}
