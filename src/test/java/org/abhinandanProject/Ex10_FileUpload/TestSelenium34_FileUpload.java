package org.abhinandanProject.Ex10_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium34_FileUpload {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement uploadElement =driver.findElement(By.id("fileToUpload"));
        String user_dir = System.getProperty("user.dir");

        System.out.println(user_dir);
        String path = user_dir+"/src/test/java/org/abhinandanProject/Ex10_FileUpload/TestData.txt";

        uploadElement.sendKeys(path);
        driver.findElement(By.name("submit")).click();
    }
}
