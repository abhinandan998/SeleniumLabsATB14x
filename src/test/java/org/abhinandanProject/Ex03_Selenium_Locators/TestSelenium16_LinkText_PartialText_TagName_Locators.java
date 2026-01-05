package org.abhinandanProject.Ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium16_LinkText_PartialText_TagName_Locators extends CommonToAll {

    @Description("Verify vmo create account negative TC")
    @Test
    public void test_login_vmo()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com/#/login");

        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        a_tag_partial_match.click();


        closeBrowser(driver);
    }
}
