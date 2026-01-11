package org.abhinandanProject.Task_11th_Jan_2026;

import org.abhinandanProject.Ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Payment_Page {

    @Test
    public void test_Payment_random_card_number()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();


        WebElement cardName = driver.findElement(By.xpath("//input[@id='cardName']"));
        cardName.sendKeys("Abhinandan Basu");

        String randomCardNumber = generateRandomCardNumber();

        WebElement cardNumber = driver.findElement(By.xpath("//input[@id='cardNumber']"));
        cardNumber.sendKeys(randomCardNumber);

        driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("12/30");
        driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("998");

        WaitHelpers.waitJVM(2000);

        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", submitBtn);

        WaitHelpers.waitJVM(3000);
        driver.quit();





}
public static String generateRandomCardNumber() {
    StringBuilder cardNumber = new StringBuilder();
    for (int i = 0; i < 16; i++) {
        cardNumber.append((int)(Math.random() * 10));
    }
    return cardNumber.toString();
}
}
