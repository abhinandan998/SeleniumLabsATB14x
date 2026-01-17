package org.abhinandanProject.Ex14_Relative_locators;

import org.abhinandanProject.Ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestSelenium44_RL_P3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        WebElement search_box = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        search_box.sendKeys("India" + Keys.ENTER);

        WaitHelpers.waitJVM(5000);

        List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,'location-name')]/p"));


        for(WebElement location : locations)
        {
            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String aqi = driver.findElement(with(By.tagName("span")).toRightOf(location)).getText();

            System.out.println("| " + rank + " | " + location.getText() + " | " + aqi + " | ");

        }
    }
}
