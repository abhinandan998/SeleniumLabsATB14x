package org.abhinandanProject.Ex04_Selenium_XPATH;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium19_MiniProject03 extends CommonToAll {

    @Owner("Abhinandan")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that with valid email, password, appointment page is loaded")
    @Test
    public void test_Katalon_login()
    {
        WebDriver driver = new EdgeDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com/");

        WebElement make_appointment_btn = driver.findElement(By.id("btn-make-appointment"));
        make_appointment_btn.click();

        WebElement input_username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        input_username.sendKeys("John Doe");

        WebElement input_password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        input_password.sendKeys("ThisIsNotAPassword");

        WebElement login_button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        login_button.click();


        custom_wait(3000);

        WebElement h2 = driver.findElement(By.xpath("//h2[text()=\"Make Appointment\"]"));

        Assert.assertEquals(h2.getText(),"Make Appointment");
        Assert.assertTrue(h2.isDisplayed());




        closeBrowser(driver);
    }
}
