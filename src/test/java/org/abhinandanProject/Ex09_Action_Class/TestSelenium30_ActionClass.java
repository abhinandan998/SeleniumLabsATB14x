package org.abhinandanProject.Ex09_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class TestSelenium30_ActionClass {

    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();


        WebElement origin = driver.findElement(By.xpath("//div[@data-id='to-testID-origin']/div/div/input"));
        WebElement destination = driver.findElement(By.xpath("//div[@data-id='to-testID-destination']/div/div/input"));

        Actions actions = new Actions(driver);

        actions.moveToElement(origin)
                .click().sendKeys("BLR").moveToElement(destination).sendKeys("DEL").build().perform();
    }

}
