package org.abhinandanProject.Ex16_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSelenium52_DDT_TestNG_POI_REAL {

    @Test(dataProvider = "getData")
    public void test_vmo_login(String email, String password)

    {
        System.out.println(email + " - " + password);
    }

    @DataProvider
    public Object[][] getData()
    {
        //READ the data from the excel file
        //give them in the 2D array
        return UtilExcel.getTestDataFromExcel("data");
    }
}
