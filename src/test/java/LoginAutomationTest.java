package com.example.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginAutomationTest {

    @Test
    public void testLogin() {
        // Set up the WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
       

        driver.get("http://localhost:8081/login");

            // Wait for elements to load
            WebDriverWait wait = new WebDriverWait(driver, 10);  // Increased timeout to 10 seconds

            // Locate username, password fields, and login button
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));  // Use ID for submit button

            // Perform login
            usernameField.sendKeys("student");
            passwordField.sendKeys("Password123");
            loginButton.click();

            // Wait for success message after login
            WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));  // Assuming success message is in h2 tag
            System.out.println("Success Message: " + successMessage.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}




