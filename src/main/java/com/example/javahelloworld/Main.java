package com.example.javahelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Main {

    @GetMapping("/")
    public String hello() {
        return "¡Hola Mundo desde Cloud Run! + Github CI/CD automático 😎😎☀️☀️😶‍🌫️";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
