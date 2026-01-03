package org.abhinandanProject.Ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11_Close_vs_Quit {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new FirefoxDriver();
        driver.get("https://google.com");
        Thread.sleep(5000);

        //driver.close();
        //close - will close the current tab, not the session(not the all tabs)
        //session id!= null

        driver.quit();
        //It will close all the tabs- session id ==null
    }
}
