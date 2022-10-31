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

public class filterSearchStream {
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
    public void filterSearch(){
        String input = "Rice";
        driver.findElement(By.id("search-field")).sendKeys(input);
        List<WebElement> element = driver.findElements(By.xpath("//tr/td[1]"));
        List<String> value = element.stream().map(s->s.getText()).filter(text -> text.contains(input)).collect(Collectors.toList());
        System.out.println(value);
        Assert.assertEquals(element.size(),value.size());
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
