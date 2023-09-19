package com.littlesekii.aritana.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lib.littlesekii.aritana.Aritana;

@RestController
@RequestMapping
public class AritanaController {

    @Value("${api.version}")
    private String apiVersion;
    
    @GetMapping("/")
    public String status() {
        return "🟢 Aritana API is currently running.";
    }

    @GetMapping("/api")
    public String api() {
        return "This is a Aritana model. Please stay tuned.";
    }

    @GetMapping("/api/version")
    public String apiVersion() {        
        return apiVersion;
    }
    
    @GetMapping("/api/lib/version")
    public String libVersion() {
        return Aritana.version();
    }
}
