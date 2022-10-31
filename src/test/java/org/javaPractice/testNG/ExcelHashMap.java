package org.javaPractice.testNG;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class ExcelHashMap {
    public static void main(String[] args) throws IOException {
        ExcelHashMap hm = new ExcelHashMap();
        System.out.println(hm.getRowCount());
    }
    public HashMap<String, String> excelOperations(int rowNum) throws IOException {
        String filePath = System.getProperty("user.dir")+"/src/test/resources/Practice.xlsx";
        File file = new File(filePath);
        Workbook book = WorkbookFactory.create(file);
        Sheet sheetName = book.getSheet("ExcelData");
        HashMap<String, String> excelMap = new HashMap<>();

        for (int i = 0; i < sheetName.getRow(0).getLastCellNum(); i++) {
            DataFormatter dataString = new DataFormatter();
            String key = dataString.formatCellValue(sheetName.getRow(0).getCell(i));
            String value = dataString.formatCellValue(sheetName.getRow(rowNum).getCell(i));
            excelMap.put(key, value);
        }
        System.out.println(excelMap);
//        book.close();
        return excelMap;
    } 

    public int getRowCount() throws IOException {
        String filePath = System.getProperty("user.dir")+"/src/test/resources/Practice.xlsx";
        File file = new File(filePath);
        Workbook book = WorkbookFactory.create(file);
        Sheet sheetName = book.getSheet("ExcelData");
        return sheetName.getLastRowNum();
    }

    public int getColumnCount() throws IOException {
        String filePath = System.getProperty("user.dir")+"/src/test/resources/Practice.xlsx";
        File file = new File(filePath);
        Workbook book = WorkbookFactory.create(file);
        Sheet sheetName = book.getSheet("ExcelData");
        return sheetName.getRow(0).getLastCellNum();
    }
}
