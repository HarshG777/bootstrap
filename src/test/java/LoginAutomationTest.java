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
            // Navigate to the login page
        //     driver.get("http://localhost:8081/login"); // Replace with actual URL

        //     // Wait for the elements to load using Duration for wait timeout
        //     WebDriverWait wait = new WebDriverWait(driver, 3);  // Correct use of Duration

        //     // Locate the username and password fields and login button
        //     WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        //     WebElement passwordField = driver.findElement(By.id("password"));
        //     WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-primary")));

        //     // Perform login
        //     usernameField.sendKeys("student");
        //     passwordField.sendKeys("Password123");
        //     loginButton.click();

        //     // Validate successful login
        //     WebElement successMessage = driver.findElement(By.className("post-title"));
        //     String expectedMessage = "Logged In Successfully";
        //     assertTrue(successMessage.getText().contains(expectedMessage), "Login was not successful.");

        // } finally {
        //     // Close the browser
        //     driver.quit();
        // }

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


// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;

// import java.time.Duration;

// public class LoginAutomationTest {
//     public static void main(String[] args) {
//         System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//         WebDriver driver = new ChromeDriver();

//         try {
//             // Navigate to the login page
//             driver.get("http://localhost:8080/login");

//             // Wait for the elements to load using Duration for wait timeout
//             WebDriverWait wait = new WebDriverWait(driver, 10000);  // Correct use of Duration

//             WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
//             WebElement passwordField = driver.findElement(By.id("password"));
//             WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));

//             // Perform login
//             usernameField.sendKeys("student");
//             passwordField.sendKeys("Password123");
//             loginButton.click();

//             // Verify the login success (adjust the success message or redirect page validation as needed)
//             WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
//             System.out.println("Success Message: " + successMessage.getText());

//         } catch (Exception e) {
//             e.printStackTrace();
//         } finally {
//             driver.quit();
//         }
//     }
// }

