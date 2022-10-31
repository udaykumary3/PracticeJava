package ExcelDriven;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataDriven {
    public static void main(String[] args) throws IOException {
        DataDriven drive = new DataDriven();
        drive.getData();
        System.out.println(drive.getData());
    }

    public ArrayList<String> getData() throws IOException {
        FileInputStream file = new FileInputStream("C://Users//udayk//OneDrive//Desktop//test.xlsx");
        ArrayList<String> dataArray = new ArrayList<String>();
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                Iterator<Row> rows = sheet.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> cells = firstRow.cellIterator();
                int k = 0;
                int column = 0;
                while (cells.hasNext()) {
                    Cell value = cells.next();
                    if (value.getStringCellValue().contains("TestCases")) {
                        column = k;
                    }
                    k++;
                }
                while (rows.hasNext()) {
                    Row rowValue = rows.next();
                    if (rowValue.getCell(column).getStringCellValue().contains("Purchase")) {
                        Iterator<Cell> desiredCellValue = rowValue.cellIterator();
                        while (desiredCellValue.hasNext()) {
                            dataArray.add(desiredCellValue.next().getStringCellValue());
                        }
                    }
                }
            }
        }
        return dataArray;
    }
}
