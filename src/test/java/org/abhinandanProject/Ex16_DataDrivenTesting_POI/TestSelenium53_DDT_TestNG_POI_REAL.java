package org.abhinandanProject.Ex16_DataDrivenTesting_POI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium53_DDT_TestNG_POI_REAL {

    @Test(dataProvider = "getData")
    public void test_vmo_login(String email, String password)
    {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://app.vwo.com/");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        WebElement emailInput = driver.findElement(By.id("login-username"));
        emailInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys(password);


        WebElement submitButton = driver.findElement(By.id("js-login-btn"));
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));


        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");


        driver.quit();


    }
    @DataProvider
    public Object[][] getData()
    {
        //Read the data from the excel file
        //give them in 2D array
        return UtilExcel.getTestDataFromExcel("data");
    }

}
