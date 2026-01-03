package org.abhinandanProject.Ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium09_Navigation_GET_NAVIGATED {

    @Description("Open The url")
    @Test

    public void test_Selenium01()
    {
        WebDriver driver = new FirefoxDriver();


        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}
