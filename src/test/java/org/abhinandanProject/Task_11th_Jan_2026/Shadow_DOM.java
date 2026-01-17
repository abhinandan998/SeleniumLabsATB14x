package org.abhinandanProject.Task_11th_Jan_2026;

import org.abhinandanProject.Ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
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

        WaitHelpers.waitJVM(2000);
        WebElement concept_test = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#concepts')");
        //workaround inside closed shadowDOM
        WaitHelpers.waitJVM(2000);
        concept_test.click();

        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys("DevTools cltr+f is not right plaform to verify xpath").perform();

        WaitHelpers.waitJVM(3000);

        action.sendKeys(Keys.TAB).perform();
        //for the url to click;
//        WaitHelpers.waitJVM(3000);
//        action.sendKeys(Keys.ENTER).perform();

        action.sendKeys(Keys.TAB).perform();
        action.sendKeys("Abhi@12345").perform();



        //driver.quit();
    }
}
