package org.abhinandanProject.Ex17_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium41 {

    @Test
    public void test_webtable1()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));

        //rows and columns
        List<WebElement> rows_table = table.findElements(By.tagName("tr"));

        for(int i=0;i<rows_table.size();i++)
        {
            List<WebElement> col = rows_table.get(i).findElements(By.tagName("td"));
            for (WebElement c: col)
            {
                System.out.println(c.getText());
            }
        }
    }
}
