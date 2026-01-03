package org.abhinandanProject.Ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium_ProjectNo2 extends CommonToAll {

    @Description("Options Class")
    @Test
    public void test02()
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        //chromeOptions.addArguments("--window-size=1920,1080");
        //chromeOptions.addArguments("--incognito");
        File path = new File("src/test/java/org/abhinandanProject/Ex02_SeleniumBasics/AdBlockerss.crx");
        edgeOptions.addExtensions(path);
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=jhBAUzoXj_A");



    }
}
