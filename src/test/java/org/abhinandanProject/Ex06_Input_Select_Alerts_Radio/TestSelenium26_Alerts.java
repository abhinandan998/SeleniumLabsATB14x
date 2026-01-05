package org.abhinandanProject.Ex06_Input_Select_Alerts_Radio;

import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium26_Alerts  extends CommonToAll {

    @Test
    public void test_alerts()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());

    //    WebElement element = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
   //   WebElement elementConform = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
       WebElement elementPrompt = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));

        //element.click();
        //elementConform.click();
        elementPrompt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Abhinandan");
        alert.accept();
        //alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You entered: Abhinandan");

        closeBrowser(driver);
    }
}
