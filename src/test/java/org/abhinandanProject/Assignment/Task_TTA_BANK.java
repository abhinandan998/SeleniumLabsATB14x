package org.abhinandanProject.Assignment;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.abhinandanProject.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task_TTA_BANK extends CommonToAll {

    @Owner("Abhinandan Basu")
    @Description("Add a New beneficiaries and verify in the same below that is added")
    @Test
    public void test_TTA_Bank()
    {
        WebDriver driver = new EdgeDriver();
        openBrowser(driver, "https://tta-bank-digital-973242068062.us-west1.run.app/");

        //Account creation
        WebElement signup_btn = driver.findElement(By.xpath("//button[text()=\"Sign Up\"]"));
        signup_btn.click();

        WebElement name = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        name.sendKeys("Abhinandan Basu");

        WebElement email_id = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        email_id.sendKeys("basu.abhinandan@ttabank.com");

        WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        pass.sendKeys("Abhi@12345");

        WebElement create_acc_btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        create_acc_btn.click();

        custom_wait(2000);

//        //DashBoard validation
        WebElement dashboard_check= driver.findElement(By.xpath("//h1[text()=\"Dashboard\"]"));
        Assert.assertEquals(dashboard_check.getText(), "Dashboard");


        WebElement Transfer_amt = driver.findElement(By.xpath("//button[text()=\"Transfer Funds\"]"));
        Transfer_amt.click();

        custom_wait(2000);

        //Adding beneficiaries
        WebElement manage_benef = driver.findElement(By.xpath("//button[text()=\"Manage Beneficiaries\"]"));
        manage_benef.click();

        List<WebElement> full_name = driver.findElements(By.xpath("//input[@type=\"text\"]"));
        full_name.get(0).sendKeys("Shrayashi Ghosh");

        List<WebElement> Bank_name = driver.findElements(By.xpath("//input[@type=\"text\"]"));
        Bank_name.get(1).sendKeys("ICICI Bank");

        List<WebElement> acc_no= driver.findElements(By.xpath("//input[@type=\"text\"]"));
        acc_no.get(2).sendKeys("851347834724");

        WebElement save_details = driver.findElement(By.xpath("//button[text()=\"Save Beneficiary\"]"));
        save_details.click();

        //Go to manage beneficiary and check if the data is saved or not
        WebElement manage_beneficiary = driver.findElement(By.xpath("//button[text()=\"Manage Beneficiaries\"]"));
        manage_beneficiary.click();
        custom_wait(2000);

        WebElement added_data = driver.findElement(By.xpath("//p[text()=\"Shrayashi Ghosh\"]"));
        System.out.println(added_data.getText());

        Assert.assertEquals(added_data.getText(), "Shrayashi Ghosh");

        closeBrowser(driver);

    }
}
