package org.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class PractTables {
    static WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }
    @Test
    public void testTables(){
        WebElement table = driver.findElement(By.cssSelector("[name='courses']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        List<WebElement> columns = table.findElements(By.tagName("td"));
        int rowCount = rows.size();
        int colCount = columns.size();
        System.out.println("No. of rows "+rowCount+" No.of columns "+colCount);

        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                System.out.println(columns.get(col).getText());
            }
        }
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
