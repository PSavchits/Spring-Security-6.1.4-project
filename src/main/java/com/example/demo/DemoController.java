package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {
    @GetMapping
    public String sayHello(){
        return "Hello";
    }
    /*@GetMapping
    public ResponseEntity<String> sayHell(){
        return ResponseEntity.ok("Hello from secured endpoint");
    }*/
}
