package com.chan;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.err.println("Hello Common...");
    }
}

