package org.javaPractice.testNG;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ExcelTest {

    public ArrayList<String> readDataExcel(String cellName) throws IOException {
        ArrayList<String> cellData = new ArrayList<>();
        FileInputStream file = new FileInputStream("A:\\Practice.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(file);
        int sheets = book.getNumberOfSheets();

        for (int i = 0; i < sheets; i++) {
            if (book.getSheetName(i).equalsIgnoreCase("exceldata")) {
                XSSFSheet sheet = book.getSheetAt(i);
                Iterator<Row> rows = sheet.rowIterator();
                Row firstRow = rows.next();
                Iterator<Cell> cells = firstRow.cellIterator();
                int k = 0;
                int column = 0;
                while(cells.hasNext()){
                    Cell value = cells.next();
                    if(value.getStringCellValue().equalsIgnoreCase("testdata")){
                        column = k;
                    }
                    k++;
                }
                System.out.println("Column number is : "+column);

                while(rows.hasNext()){
                    Row rowValue = rows.next();
                    if(rowValue.getCell(column).getStringCellValue().equalsIgnoreCase(cellName)){
                        Iterator<Cell> cellContent = rowValue.cellIterator();
                        while (cellContent.hasNext()){
                            cellData.add(cellContent.next().getStringCellValue());
                        }
                    }
                }
            }
        }
        return cellData;
    }

    public static void main(String[] args) throws IOException {
        ExcelTest test = new ExcelTest();
        ArrayList<String> cellsValue = test.readDataExcel("log out");
        System.out.println(cellsValue);
    }
}
