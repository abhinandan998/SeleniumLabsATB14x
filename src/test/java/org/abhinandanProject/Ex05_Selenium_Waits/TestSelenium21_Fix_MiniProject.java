package org.abhinandanProject.Ex05_Selenium_Waits;

import io.qameta.allure.Description;
import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium21_Fix_MiniProject extends CommonToAll {

    @Description("Verify that with invalid email, pass, error message is shown on the app.vmo.com")
    @Test
    public void testVMO_Login_Negative()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com/#/login");

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        WebElement password_input_box = driver.findElement(By.id("login-password"));
        password_input_box.sendKeys("password123");

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("js-notification-box-msg")));

        WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

        closeBrowser(driver);
    }
}
