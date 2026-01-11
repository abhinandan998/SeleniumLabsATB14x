package org.abhinandanProject.Task_11th_Jan_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;

import java.util.Set;

public class Shadow_DOM {

    @Test
    public void test_shadow_DOM() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();


        JavascriptExecutor js = (JavascriptExecutor) driver;


        WebElement username = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('input#kils')");
        username.sendKeys("basuabhinandan99@gmail.com");


        WebElement input_pizza = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('input#pizza')");
        input_pizza.sendKeys("farmhouse");

        driver.quit();
    }
}
