package com.example.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/auth")
public class WebController {
    @GetMapping("/register")
    public String showRegistrationPage() {
        return "auth/register";
    }
}
