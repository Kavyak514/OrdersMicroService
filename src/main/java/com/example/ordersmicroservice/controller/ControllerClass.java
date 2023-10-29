package com.example.ordersmicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Microservices";
    }
}
