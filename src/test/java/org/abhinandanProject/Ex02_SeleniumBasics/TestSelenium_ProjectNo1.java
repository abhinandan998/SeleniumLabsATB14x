package org.abhinandanProject.Ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_ProjectNo1 extends CommonToAll {

    @Description("TC#1 - Varify that a particular text exists on a katalon website")
    @Test
    public void test_verify_text()
    {
        WebDriver driver = new FirefoxDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com");

        if(driver.getPageSource().contains("CURA Healthcare Service"))
        {
            System.out.println("✅Test Case PASSED!");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("❌Test Case FAILED!");
            Assert.assertTrue(false);
        }
        closeBrowser(driver);
    }

}
