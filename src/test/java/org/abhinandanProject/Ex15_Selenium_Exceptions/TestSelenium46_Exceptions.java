package org.abhinandanProject.Ex15_Selenium_Exceptions;

import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium46_Exceptions extends CommonToAll {

    @Test
    public void test_exception() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");

        try {
            driver.findElement(By.id("abhi"));
        } catch (NoSuchElementException e) {
            System.out.println("Element not found!");
        }
        driver.close();
    }
}
