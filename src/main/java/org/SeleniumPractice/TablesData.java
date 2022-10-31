package org.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TablesData {
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
    public void tableData(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        //number of rows in table
        List<WebElement> rows = driver.findElements(By.cssSelector("[name='courses'] tr"));
        //number of columns in table
        List<WebElement> columns = driver.findElements(By.cssSelector("[name='courses'] th"));
        System.out.println("no. of rows in table are "+rows.size()+" no. of columns in table are "+columns.size());

        String thirdRow = driver.findElement(By.cssSelector("[name='courses'] tr:nth-child(3)")).getText();
        System.out.println("Value in Third row : "+thirdRow);
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
