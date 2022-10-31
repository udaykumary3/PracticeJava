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

public class Calender {
    static WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }
    @Test
    public void calender() throws InterruptedException {
        driver.findElement(By.id("travel_date")).click();
        WebElement month = driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch"));
        month.click();
        WebElement year = driver.findElement(By.cssSelector(".datepicker-months .datepicker-switch"));
        while(!driver.findElement(By.cssSelector(".datepicker-months .datepicker-switch")).getText().contains("2023")){
            driver.findElement(By.cssSelector(".datepicker-months .table-condensed .next")).click();
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class = 'datepicker-months']/table/tbody/tr/td/span[1]")).click();
        while (!driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).getText().contains("April")){
            driver.findElement(By.cssSelector(".datepicker-days .next")).click();
        }

        List<WebElement> days = driver.findElements(By.cssSelector(".day"));
        int count = days.size();
        for (int i = 0; i < count; i++) {
            String dayName = days.get(i).getText();
            if(dayName.equalsIgnoreCase("1")){
                days.get(i).click();
                break;
            }
        }
        Thread.sleep(4000);
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
