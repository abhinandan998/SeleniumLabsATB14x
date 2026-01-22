package org.abhinandanProject.Ex16_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSelenium50_DDT_TestNG_POI {

    @Test(dataProvider = "getData")
    public void test_vmo_login(String username, String password)
    {
        System.out.println("Multiple time login I have to check!");
        System.out.println(username + " - " + password);
        System.out.println();
    }
    @DataProvider
    public Object[][] getData() {
        return new Object[][]
                {
                        new Object[]{"admin@gmail.com", "pass123"},
                        new Object[]{"admin123@gmail.com", "pass123"},
                        new Object[]{"admin456@gmail.com", "pass123"},
                        new Object[]{"admin789@gmail.com", "pass123"}

                };

    }
    }


