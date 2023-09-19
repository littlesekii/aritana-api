package com.littlesekii.aritana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AritanaController {
    
    @GetMapping("/")
    public String status() {
        return "🟢 Aritana API is currently running.";
    }

    @GetMapping("/api")
    public String api() {
        return "This is a Aritana model. Please stay tuned.";
    }
}
