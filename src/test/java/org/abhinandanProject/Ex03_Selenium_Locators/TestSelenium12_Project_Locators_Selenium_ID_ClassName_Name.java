package org.abhinandanProject.Ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium12_Project_Locators_Selenium_ID_ClassName_Name extends CommonToAll {


        @Description("TC#1 - verify that with invalid login, error message is displayed!")
        @Owner("Abhinandan Basu")
        @Severity(SeverityLevel.BLOCKER)
        @Test
        public void test_vmo_invalid_login() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            openBrowser(driver, "https://app.vwo.com/#/login");

            WebElement email_input_box = driver.findElement(By.id("login-username"));
            email_input_box.sendKeys("admin@admin.com");

            WebElement password_input_box = driver.findElement(By.id("login-password"));
            password_input_box.sendKeys("password123");

            WebElement submit_button = driver.findElement(By.id("js-login-btn"));
            submit_button.click();

          custom_wait(3000);

            WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
            System.out.println(error_message.getText());

            Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

            closeBrowser(driver);
        }

}
