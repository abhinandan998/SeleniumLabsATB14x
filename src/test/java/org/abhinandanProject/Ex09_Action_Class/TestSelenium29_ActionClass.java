package org.abhinandanProject.Ex09_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class TestSelenium29_ActionClass {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://awesomeqa.com/practice.html";
        driver.get(url);
        driver.manage().window().maximize();


        //Keys - Action classes

        WebElement firstname = driver.findElement(By.name("firstname"));


        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstname, "abhinandan")
                .keyUp(Keys.SHIFT).build().perform();
    }
}
