package org.abhinandanProject.Ex16_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSelenium51_DDT_TestNG_POI_Steps {

    @Test(dataProvider = "getData")
    public void test_vmo_login(String email, String password)

    {
        System.out.println(email + " - " + password);
    }

    @DataProvider
    public Object[][] getData()
    {
        //Read the excel file
        //convert the data R,C into the data[][]
        //return new Object[][];
        return null;
    }
}
