package org.abhinandanProject.Task_11th_Jan_2026;

import org.abhinandanProject.Ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dummy_Form {

    @Test
    public void test_fill_details()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        WaitHelpers.waitJVM(3000);


        WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
        username.sendKeys("basuabhinandan99@gmail.com");

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Abhi@12345");

        WebElement company_name = driver.findElement(By.name("company"));
        company_name.sendKeys("Infor India Pvt. LTD.");

        WebElement phone_number = driver.findElement(By.name("mobile number"));
        phone_number.sendKeys("+91 9144243431");

        WebElement country_name = driver.findElement(By.xpath("//label[text()='Country']/input"));
        country_name.sendKeys("India");

        WebElement crushName = driver.findElement(By.id("inp_val"));
        crushName.sendKeys("Shrayashi Ghosh");

        WebElement buttn = driver.findElement(By.xpath("//button[@value='Submit']"));
        buttn.click();


        driver.quit();

    }
}
