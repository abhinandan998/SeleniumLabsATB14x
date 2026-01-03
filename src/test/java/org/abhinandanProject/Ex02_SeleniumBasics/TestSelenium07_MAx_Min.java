package org.abhinandanProject.Ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium07_MAx_Min {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        driver.manage().window().maximize();
        //driver.manage().window().minimize();

        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.quit();
    }
}
