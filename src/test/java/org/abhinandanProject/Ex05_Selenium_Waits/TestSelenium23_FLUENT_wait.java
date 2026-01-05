package org.abhinandanProject.Ex05_Selenium_Waits;

import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class TestSelenium23_FLUENT_wait extends CommonToAll {

    @Test
    public void test_fw()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com/#/login");

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        WebElement password_input_box = driver.findElement(By.id("login-password"));
        password_input_box.sendKeys("password123");

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();


        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement error_message = wait.until(
                new Function<WebDriver, WebElement>() {
                    @Override
                    public WebElement apply(WebDriver driver) {
                        return driver.findElement(By.id("js-notification-box-msg"));
                    }
                }
        );


        closeBrowser(driver);
    }

}
