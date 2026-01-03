package org.abhinandanProject.Ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium03 {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        //new FirefoxDriver(); - the START of the selenium session
        //session - fresh copy of browser is started
        //POST request to the server - Firefox driver.

        driver.get("https://sdet.live");
        //command no 2- POST request to give to the driver to navigate to the URL;
    }
}
