package com.example.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginAutomationTest {

    @Test
    public void testLogin() {
        // Set up the WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the login page
            driver.get(""); // Replace with actual URL

            // Locate the username and password fields and login button
            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("submit"));

            // Perform login
            usernameField.sendKeys("student");
            passwordField.sendKeys("Password123");
            loginButton.click();

            // Validate successful login
            WebElement successMessage = driver.findElement(By.className("post-title"));
            String expectedMessage = "Logged In Successfully";
            assertTrue(successMessage.getText().contains(expectedMessage), "Login was not successful.");

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
