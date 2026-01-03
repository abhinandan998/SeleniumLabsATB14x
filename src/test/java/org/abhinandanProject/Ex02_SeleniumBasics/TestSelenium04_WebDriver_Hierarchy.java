package org.abhinandanProject.Ex02_SeleniumBasics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSelenium04_WebDriver_Hierarchy {
    public static void main(String[] args) {

        //WebDriver hierarchy
        //SearchContent(I) -> (2)-> WebDriver(I) (10) -> RemoteWebDriver(C) (~15)
        //         //// -> Chromium Driver(C) ~25 -> Edge Driver(C) (~45)
        //SearchContext - Interface - findElement, findElements - GGF
        //WebDriver - Interface - some incomplete function - GF
        //RemoteWebDriver - Class - It also has some Function - F
        //ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver class - S

//        SearchContext driver = new FirefoxDriver();
//        SearchContext driver1 = new ChromeDriver();
//        SearchContext driver2 = new EdgeDriver();
//
//        WebDriver driver = new FirefoxDriver();
//        RemoteWebDriver driver1 = new FirefoxDriver();
//        FirefoxDriver driver2 = new FirefoxDriver();

        //Scenarios

        //1. Do you want to run on chrome or edge

//        ChromeDriver driver2 = new ChromeDriver();
//        driver2 = FirefoxDriver();

        //2. Do you want to run on chrome then change to edge
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();
        driver = new FirefoxDriver();

        //3. Do you want to run on multiple browsers, aws machine?
        //RemoteWebDriver driver(with GRID) - Advanced


    }
}
