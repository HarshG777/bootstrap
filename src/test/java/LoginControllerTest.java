package com.example.loginapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.example.loginapp.LoginAppApplication; // Import your main application class

@SpringBootTest(classes = LoginAppApplication.class) // Specify the main application class
public class LoginControllerTest {

    @Autowired
    private LoginController loginController;

    @Test
    public void contextLoads() {
        assertNotNull(loginController);
    }

    // Add more tests for the methods in LoginController
}

