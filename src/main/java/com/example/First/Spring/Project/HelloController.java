package com.example.First.Spring.Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/Welcome")
    public String hello() {
        return "Welcome to Day 01!";
    }
}