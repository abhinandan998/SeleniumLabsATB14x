package org.abhinandanProject.Ex15_Selenium_Exceptions;

import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium49_Exceptions_TimeOut extends CommonToAll {

    @Test
    public void test_exception() throws  TimeoutException{
        WebDriver driver = new ChromeDriver();
        System.out.println("Start of the program!");
        driver.get("https://google.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));
    }
}
