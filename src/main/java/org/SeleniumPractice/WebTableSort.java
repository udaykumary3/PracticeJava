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

public class WebTableSort {
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
    public void tableSort(){
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
        List<String> originalList = elements.stream().map(s->s.getText()).collect(Collectors.toList());
        List<String> sortedList = elements.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
        Assert.assertTrue(originalList.equals(sortedList));

        //get price of beans from the table
        List<String> price = elements.stream().filter(s->s.getText().contains("Beans")).map(s->getPrice(s)).collect(Collectors.toList());
        price.forEach(a-> System.out.println(a));
    }

    private String getPrice(WebElement veg) {
        String price = veg.findElement(By.xpath("following-sibling::td[1]")).getText();
        return price;
    }


    @AfterTest
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

}
