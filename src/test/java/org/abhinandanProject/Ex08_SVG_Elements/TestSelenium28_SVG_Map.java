package org.abhinandanProject.Ex08_SVG_Elements;

import io.qameta.allure.Description;
import org.abhinandanProject.Ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium28_SVG_Map {

    ChromeDriver driver;

    @BeforeTest
    public void openBrowser()
    {
        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.addArguments("---guest");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

    }
    @Description("Verify Tripura is present in the map and click to open it")
    @Test
    public void test_India_map_svg()
    {
        String url = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(url);
        driver.manage().window().maximize();


       WaitHelpers.waitJVM(5000);

       List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
       for(WebElement state : states)
       {
           System.out.println(state.getDomAttribute("aria-label"));
           if(state.getDomAttribute("aria-label").contains("Tripura"))
           {
               state.click();
           }

       }

       WaitHelpers.waitJVM(3000);
       driver.quit();


    }
}
