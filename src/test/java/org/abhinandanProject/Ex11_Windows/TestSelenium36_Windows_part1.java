package org.abhinandanProject.Ex11_Windows;

import org.abhinandanProject.Ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSelenium36_Windows_part1 {

    @Test
    public void test_windows()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);

        WaitHelpers.waitJVM(3000);


        WebElement link_parent = driver.findElement(By.xpath("//a[text()='Click Here']"));
        link_parent.click();

        Set<String> windows_handles_id = driver.getWindowHandles();
        //2- 16 digits ids

        for(String window: windows_handles_id)
        {
            driver.switchTo().window(window);
            if(driver.getPageSource().contains("New Window"))
            {
                System.out.println("Test Passes!");
            }
        }
        driver.switchTo().window(parent_id);
        WaitHelpers.waitJVM(2000);

        driver.quit();

    }
}
