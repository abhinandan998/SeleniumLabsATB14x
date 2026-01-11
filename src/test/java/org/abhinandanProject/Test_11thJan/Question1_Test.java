package org.abhinandanProject.Test_11thJan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1_Test {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");


        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);
    }
}
