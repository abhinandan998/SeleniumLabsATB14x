package org.abhinandanProject.Test_11thJan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question2_test {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://example.com/login");


        driver.findElement(By.id("username")).sendKeys("testuser");


        driver.findElement(By.id("password")).sendKeys("testpass");


        driver.findElement(By.id("loginBtn")).click();


        String currentUrl = driver.getCurrentUrl();
        System.out.println("Navigated to: " + currentUrl);


        if (currentUrl.contains("dashboard")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed or redirected elsewhere");
        }

        // Close browser
        driver.quit();
    }
}
