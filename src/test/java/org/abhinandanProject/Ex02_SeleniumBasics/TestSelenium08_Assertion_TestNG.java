package org.abhinandanProject.Ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium08_Assertion_TestNG {

    @Test
    public void test_selenium01()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        //TestNG
        Assert.assertEquals(driver.getTitle(),"Google");

        //AssetJ Validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://google.com/");
    }
}
