package org.abhinandanProject.Ex12_JavaScript_ex;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab38_JS_code {

    @Test
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //
        // js.executeScript("alert(1);");

        js.executeScript("window.location= 'https://www.google.com'");

        driver.get("https://selectorshub.com/xpath-practice-page/");

        js.executeScript("window.scrollBy(0,500);");
        js.executeScript("window.scrollBy(0,500);");

        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);
    }
}
