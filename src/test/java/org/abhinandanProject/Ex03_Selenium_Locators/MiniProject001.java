package org.abhinandanProject.Ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MiniProject001 extends CommonToAll {

    @Description("Varify vmo create account negative test case")
    @Test
    public void test_vmo_free_trial()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com/#/login");

        WebElement a_tag_free_trial_full_match = driver.findElement(By.linkText("Start a free trial"));
        a_tag_free_trial_full_match.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email_box = driver.findElement(By.id("page-v1-step1-email"));
        email_box.sendKeys("abc1424");

        WebElement check_box = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        check_box.click();

        WebElement button_create_account = driver.findElement(By.tagName("button"));
        button_create_account.click();

        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");



        closeBrowser(driver);
    }
}
