// package com.example.loginapp.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;

// @Controller
// public class LoginController {

//     @GetMapping("/")
//     public String showLoginForm() {
//         return "login";
//     }

//     @PostMapping("/login")
//     public String processLogin(@RequestParam String username,
//                                @RequestParam String password,
//                                Model model) {
//         if ("student".equals(username) && "Password123".equals(password)) {
//             model.addAttribute("message", "Logged In Successfully");
//             return "success";
//         } else {
//             model.addAttribute("error", "Invalid username or password");
//             return "login";
//         }
//     }
// }
package com.example.loginapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    
    @GetMapping("/login")
    public String login() {
        // Original code
        return "Login Successful";
    }
    
    @GetMapping("/login")
    public String duplicateLogin() {
        // Duplicated code
        return "Login Successful";  // This is a simple duplication of the same return logic
    }
}
