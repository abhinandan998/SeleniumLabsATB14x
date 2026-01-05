package org.abhinandanProject.Ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium12_Change_Driver {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver = new FirefoxDriver();
    }
}
