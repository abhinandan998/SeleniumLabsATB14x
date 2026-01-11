package org.abhinandanProject.Test_11thJan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Question4_test {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();


            driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");


            WebElement countryDropdown = driver.findElement(By.tagName("select"));
            Select select = new Select(countryDropdown);

            // Get all options
            List<WebElement> options = select.getOptions();
            System.out.print("Options: [");
            for (int i = 0; i < options.size(); i++) {
                System.out.print(options.get(i).getText());
                if (i < options.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            // Select by visible text
            select.selectByVisibleText("United States");

            // Verify selected option
            String selectedOption = select.getFirstSelectedOption().getText();
            System.out.println("Selected by text: " + selectedOption);

            // Select by index
            select.selectByIndex(2);
            System.out.println("Selected by index: " +
                    select.getFirstSelectedOption().getText());

            // Select by value
            select.selectByValue("IND");
            System.out.println("Selected by value: " +
                    select.getFirstSelectedOption().getText());

        } finally {
            driver.quit();
        }
    }
}
