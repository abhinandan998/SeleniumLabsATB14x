package org.abhinandanProject.Ex05_Selenium_Waits;

import io.qameta.allure.Description;
import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium22_MiniProject04 extends CommonToAll {

    @Description("Verify makemytrip opens with modal")
    @Test
    public void testCloseModal()
    {
        WebDriver driver = new ChromeDriver();
        //driver.navigate().to("https://www.makemytrip.com/");
        openBrowser(driver,"https://www.makemytrip.com/" );

        System.out.println(driver.getTitle());

        waitForVisibility(driver, 3000, "//span[@data-cy=\"closeModal\"]");

        WebElement closepopup = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closepopup.click();

        closeBrowser(driver);


    }
}
