package org.abhinandanProject.Ex13_JS_ShadowDOM;

import org.abhinandanProject.Ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab39_JS_code_ShadowDOM {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
        driver.manage().window().maximize();

        WaitHelpers.waitJVM(3000);

        JavascriptExecutor js =(JavascriptExecutor) driver;
        WebElement input_pizza = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('input#pizza')");
        input_pizza.sendKeys("farmhouse");

    }
}
