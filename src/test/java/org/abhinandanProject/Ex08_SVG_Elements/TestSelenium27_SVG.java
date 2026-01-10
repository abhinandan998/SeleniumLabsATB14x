package org.abhinandanProject.Ex08_SVG_Elements;



import io.qameta.allure.Description;
import org.abhinandanProject.Ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium27_SVG  {

    ChromeDriver driver;

    @Description("verify that the search with svg icon results are visible")
    @Test
    public void test_Flipkart_Search_Icon_SVG()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.flipkart.com/search";
        driver.get(url);

        WebElement search_input = driver.findElement(By.xpath("//input[@name=\"q\"]"));
        search_input.sendKeys("macmini");

        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();

        WaitHelpers waitHelpers = new WaitHelpers();
        WaitHelpers. checkVisibility(driver, By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));

        List<WebElement> titleResults = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
        for(WebElement title: titleResults)
        {
            System.out.println(title.getText());
        }

        WaitHelpers.waitJVM(5000);
        driver.quit();



    }
}
