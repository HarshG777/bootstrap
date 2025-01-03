// package com.example.loginapp.controller;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import com.example.loginapp.LoginAppApplication; // Import your main application class

// @SpringBootTest(classes = LoginAppApplication.class) // Specify the main application class
// public class LoginControllerTest {

//     @Autowired
//     private LoginController loginController;

//     @Test
//     public void contextLoads() {
//         assertNotNull(loginController);
//     }

//     // Add more tests for the methods in LoginController
// }

package com.example.loginapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.ui.Model;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LoginControllerTest {

    @Autowired
    private LoginController loginController;

    @MockBean
    private Model model;

    // Test for showLoginForm
    @Test
    public void testShowLoginForm() {
        String viewName = loginController.showLoginForm();
        assertEquals("login", viewName); // Check if it returns "login" view
    }

    // Test for successful login
    @Test
    public void testProcessLoginSuccess() {
        String result = loginController.processLogin("student", "Password123", model);
        assertEquals("success", result); // Should return "success" view for valid login
    }

    // Test for unsuccessful login (incorrect username/password)
    @Test
    public void testProcessLoginFailure() {
        String result = loginController.processLogin("wronguser", "wrongpassword", model);
        assertEquals("login", result); // Should return "login" view for invalid login
    }

    // Additional tests can be added for edge cases, like empty username or password, etc.
}
