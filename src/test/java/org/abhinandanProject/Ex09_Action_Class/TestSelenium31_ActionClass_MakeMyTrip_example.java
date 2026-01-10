package org.abhinandanProject.Ex09_Action_Class;


import org.abhinandanProject.CommonToAll;
import org.abhinandanProject.Ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium31_ActionClass_MakeMyTrip_example extends CommonToAll {

    @Test
    public void test_action_p4()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://www.makemytrip.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        //This will close the modal
        WebElement close_modal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        close_modal.click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='minimize']")));

        //This will close the modal
        WebElement ai_modal = driver.findElement(By.xpath("//img[@alt='minimize']"));
        ai_modal.click();

        WebElement background_element =  driver.findElement(By.tagName("body"));
        background_element.click();

        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy='toCity']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().build().perform();

        WaitHelpers.waitJVM(5000);

        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();
        WaitHelpers.waitJVM(2000);

        try {
            List<WebElement> list_auto_suggest = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));

            for (WebElement e : list_auto_suggest) {
                if (e.getText().contains("Chandigarh")) {
                    e.click();
                }
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


        actions.moveToElement(toCity).click().sendKeys("DEL").build().perform();
        WaitHelpers.waitJVM(2000);

        try {
            List<WebElement> list_auto_suggest = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));

            for (WebElement e : list_auto_suggest) {
                if (e.getText().contains("Del")) {
                    e.click();
                }
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }



        closeBrowser(driver);
    }


}
