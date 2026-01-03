package org.abhinandanProject.Ex02_SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.reflect.Field;

public class TestSelenium10_NoHTTP {
    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        //driver.get("bing.com"); //HTTP is important
        driver.get("https://bing.com"); //HTTPs is important
    }
}
