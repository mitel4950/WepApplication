package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
    @GetMapping("/Hello")
    public String Getter() {
        return "Hellow";
    }

    @PostMapping("/Poster")
    public ResponseEntity<String> Poster() {
        return ResponseEntity.ok("Poster Hellow");
    }


}
