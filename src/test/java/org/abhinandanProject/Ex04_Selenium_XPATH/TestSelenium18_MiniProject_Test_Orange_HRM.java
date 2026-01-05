package org.abhinandanProject.Ex04_Selenium_XPATH;


import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
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

public class TestSelenium18_MiniProject_Test_Orange_HRM extends CommonToAll {

    @Owner("Abhinandan Basu")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login is Working")
    @Test
    public void test_Orange_HRM_login()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // ✅ WAIT for username field
        WebElement login_username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@name='username']")
                )
        );

        WebElement login_password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@type='password']")
                )
        );

        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[@type='submit']")
                )
        );

        login_username.sendKeys("admin");
        login_password.sendKeys("Hacker@4321");
        button.click();

        custom_wait(3000);

        WebElement h6 = driver.findElement(By.xpath("//span[@class=\"oxd-topbar-header-breadcrumb\"]/h6"));

        Assert.assertEquals(h6.getText(), "PIM");


        closeBrowser(driver);




    }
}
