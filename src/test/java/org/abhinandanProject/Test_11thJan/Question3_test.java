package org.abhinandanProject.Test_11thJan;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Question3_test {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://awesomeqa.com/practice.html");


            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for element to be present in DOM
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submit")));

            // Wait for element to be visible
            WebElement element = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("submit"))
            );

            // Wait for element to be clickable and click
            long startTime = System.currentTimeMillis();
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
            long endTime = System.currentTimeMillis();

            System.out.println("Element found and clicked successfully after "
                    + ((endTime - startTime) / 1000) + " seconds");

        } catch (TimeoutException e) {
            System.out.println("Timeout: Element was not clickable within 10 seconds");
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            // Close browser
            driver.quit();
        }
    }
}
