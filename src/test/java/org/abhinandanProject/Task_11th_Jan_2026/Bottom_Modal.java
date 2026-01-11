package org.abhinandanProject.Task_11th_Jan_2026;

import org.abhinandanProject.Ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Bottom_Modal {

    @Test
    public void test_modal()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        driver.manage().window().maximize();
        WaitHelpers.checkVisibility(driver, By.id("myBtn"));

        WebElement modalButton = driver.findElement(By.id("myBtn"));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", modalButton);

        WaitHelpers.waitJVM(2000);

        WebElement close_modal = driver.findElement(By.xpath("//div[@id='myModal']//div//div//span"));
        close_modal.click();


        driver.quit();
    }
}
