package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class UsernameLoginTesting {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        // Lunch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //  Open the URL into Browser
        driver.get(baseUrl);
        //Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Print the title of the page
        System.out.println(" Title of page : " + driver.getTitle());
        // Print the current url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        // Print the page source
        System.out.println(" Page Source : " + driver.getPageSource());
        //Enter the email to email field
        WebElement usernameField = driver.findElement(By.name("username"));
        // Action
        usernameField.sendKeys("Admin");
        // Enter password to password filed
        WebElement passwordField = driver.findElement(By.name("password"));
        // Action
        passwordField.sendKeys("admin123");
            // Close the browser
        driver.close();
    }

}
