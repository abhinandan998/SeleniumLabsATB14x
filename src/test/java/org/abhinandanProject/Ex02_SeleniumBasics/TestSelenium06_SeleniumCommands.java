package org.abhinandanProject.Ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium06_SeleniumCommands {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://thetestingacademy.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
