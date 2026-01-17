package org.abhinandanProject.Ex15_Selenium_Exceptions;

import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium47_Exceptions_Stale extends CommonToAll {

    @Test
    public void test_exception() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("Start of the program!");

        WebElement search_InputBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

        driver.navigate().refresh();

        try {
            search_InputBox.sendKeys("the testing academy "+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException!");
        }
        driver.close();
    }
}
