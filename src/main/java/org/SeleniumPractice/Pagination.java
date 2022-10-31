package org.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class Pagination {
    static WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }
    @Test
    public void web(){
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> element = driver.findElements(By.xpath("//tr/td[1]"));
        List<String> originalList = element.stream().map(s->s.getText()).collect(Collectors.toList());
        List<String> sortedList = element.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
        Assert.assertTrue(originalList.equals(sortedList));
        List<String> value;
        do {
            List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
            value = elementList.stream().filter(s -> s.getText().contains("Wheat")).map(s -> priceValue(s)).collect(Collectors.toList());
            if (value.size() < 1) {
                driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
            }
        }while (value.size() < 1);
        System.out.println(value);
    }

    private String priceValue(WebElement s) {
        String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return price;
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
