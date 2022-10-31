package NewPractice.Selenium;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtils {

    @Test(dataProvider = "excelData")
    public void sampleTest(String data, String data1, String data2, String data3, String data4){
        System.out.println(data);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);
    }

    @DataProvider(name = "excelData")
    public Object[][] dataProviderTest() throws IOException {
        return excelUtils("ExcelData");
    }

    public static Object[][] excelUtils(String sheetName) throws IOException {
        Object[][] data = null;
        String filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\Practice.xlsx";
        System.out.println(filePath);

        File file = new File(filePath);
        Workbook book = WorkbookFactory.create(file);
        Sheet sheet = book.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum();
        int columnCount = sheet.getRow(0).getLastCellNum();
        System.out.println(rowCount);
        System.out.println(columnCount);

        data = new Object[rowCount][columnCount];

        for (int i=0;i<rowCount;i++ ){
            for(int j=0;j<columnCount;j++){
                data[i][j] = sheet.getRow(i+1).getCell(j).toString();
            }
        }
        return data;
    }
}
