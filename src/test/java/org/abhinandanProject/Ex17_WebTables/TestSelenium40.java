package org.abhinandanProject.Ex17_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium40 {


    @Test
    public void test_web_table_login()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        String first_part = "//table[@id='customers']/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        for(int i = 2; i<= rows; i++)
        {
            for(int j=1;j<=col;j++)
            {
                String dynamic_path = first_part+i+second_part+j+third_part;
                //System.out.println(dynamic_path);

                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data);

                if(data.contains("Helen Bennett"))
                {
                    String country_path = dynamic_path+"/following-sibling::td";

                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("-----");
                    System.out.println("Helen Bennett is in - "+country_text);
                }
            }
        }
    }
}
