package org.javaPractice.testNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;

public class DataProviders {
    ExcelHashMap map = new ExcelHashMap();

    @Test(dataProvider = "sampleData")
    public void test(String username, String password){
        System.out.println(username +" "+password);
    }

    @DataProvider(name = "sampleData")
    public Object[][] testData(){
        Object[][] obj = new Object[3][2];

        obj[0][0] = "username1";
        obj[0][1] = "password1";

        obj[1][0] = "username2";
        obj[1][1] = "password2";

        obj[2][0] = "username3";
        obj[2][1] = "password3";

        return obj;
    }

    @DataProvider(name = "easyData")
    public Object[][] easyDataProvider(){
        return new Object[][]{
                {"uday", "yakala"},
                {"uma", "Yakala"},
                {"eesu", "yakala"}
        };
    }

    @Test(dataProvider = "easyData")
    public void useEasyData(String firstName, String lastName){
        System.out.println("Names are "+lastName+" "+firstName);
    }

    @Test(dataProvider = "hashmapData")
    public void newExcelData(Object obj){
        HashMap<String, String> mapData = (HashMap<String, String>) obj;
        System.out.println(mapData);
        System.out.println(mapData.get("TestData"));
    }

    @DataProvider(name = "hashmapData")
    public Object[][] testDataSupplier() throws IOException {
        Object[][] obj = new Object[map.getRowCount()][1];
        for (int i = 1; i <= map.getRowCount() ; i++) {
            HashMap<String, String> testData = map.excelOperations(i);
            obj[i-1][0] = testData;
        }
        return obj;
    }
}
