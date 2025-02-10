package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexClass {

    @GetMapping("/users")
    public String users(){
        return "Hi cybergate";
    }
}
