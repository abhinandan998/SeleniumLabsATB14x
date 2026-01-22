package org.abhinandanProject.Ex16_DataDrivenTesting_POI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcel {

    //Apache POI
    //read the file - testData.xlsx
    //workbook create
    //sheet
    //row and cell
    //2D object - getData()

    public static String SHEET_PATH = System.getProperty("user.dir") + "/src/test/resources/TESTDATA11.xlsx";
    static Workbook book;
    static Sheet sheet;

    public static Object[][] getTestDataFromExcel(String sheetName)
    {
        FileInputStream fileInputStream = null;
        try
        {
            fileInputStream = new FileInputStream(SHEET_PATH);
            book = WorkbookFactory.create(fileInputStream);
            sheet = book.getSheet(sheetName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for(int i=0;i<sheet.getLastRowNum();i++)
        {
            for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
            {
                data[i][j] = sheet.getRow(i+1).getCell(j).toString();
            }
        }
        return data;
    }


}
