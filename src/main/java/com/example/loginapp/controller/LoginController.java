package com.example.loginapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
    public String showLoginForm() {
        int i = 10;
        int i = 10;
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password,
                               Model model) {
        if ("student".equals(username) && "Password123".equals(password)) {
            model.addAttribute("message", "Logged In Successfully");
            return "success";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}
