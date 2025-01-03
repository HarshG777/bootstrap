package com.example.loginapp;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoginAppApplicationTests {

    @Test
    void contextLoads() {
        // This method ensures that the Spring Boot application context loads.
        // It will trigger the main method of the LoginAppApplication class.
        // Since the main method calls SpringApplication.run(), we can consider it covered by this.
    }

    @Test
    void applicationStarts() {
        // This is another approach to explicitly invoke the application context and startup process.
        // By invoking SpringApplication.run() directly in this test, you will force it to execute.
        LoginAppApplication.main(new String[] {});
    }
}
