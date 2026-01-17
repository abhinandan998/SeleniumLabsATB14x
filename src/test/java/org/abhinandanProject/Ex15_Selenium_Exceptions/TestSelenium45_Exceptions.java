package org.abhinandanProject.Ex15_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium45_Exceptions {

    @Test
    public void test_exception()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");

        driver.findElement(By.id("abhi"));
        //org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#abhi"}
    }
}
