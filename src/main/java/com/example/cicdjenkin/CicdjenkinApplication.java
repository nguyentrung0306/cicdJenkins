package com.example.cicdjenkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdjenkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdjenkinApplication.class, args);
    }

    @GetMapping("/ci")
    public String Hello() {
        return "Welcome to ci cd with Jenkins!!!";
    }

}
