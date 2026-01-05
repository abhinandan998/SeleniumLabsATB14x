package org.abhinandanProject.Ex06_Input_Select_Alerts_Radio;

import io.qameta.allure.Description;
import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium24_Input_checkBox_radio extends CommonToAll {

    @Description("This is description")
    @Test
    public void test_HTMLTags()
    {
        WebDriver driver= new ChromeDriver();
        openBrowser(driver,"https://awesomeqa.com/practice.html");

        //Input
        //WebElement firstname= driver.findElement(By.name("firstname"));
        WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        firstname.sendKeys("Abhinandan");

        //RadioBox
        WebElement radiobox = driver.findElement(By.id("sex-0"));
        radiobox.click();

        //checkBox
        driver.findElement(By.id("profession-1")).click();

        closeBrowser(driver);
    }
}
