package com.chan;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
        System.err.println("Hello Service");
    }

    @Override
    public void run(String... args) throws Exception {
        System.err.println("Hello Service...");
    }
}

