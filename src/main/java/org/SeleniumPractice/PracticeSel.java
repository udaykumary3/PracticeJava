package org.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class PracticeSel {
    static WebDriver driver;
    @BeforeTest
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Test
    public void practiceSel(){
        String[] requiredProductsArray = {"Onion","Apple","Mango","Grapes"};
        int count = 0;
        List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i).getText();
            System.out.println(name);
            String[] nameArray = name.split("-");
            String requiredProductName = nameArray[0].trim();
            System.out.println(requiredProductName);
            for (String s : requiredProductsArray) {
                if (s.equalsIgnoreCase(requiredProductName)) {
                    driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
                    count++;
                }
            }
            if(count == requiredProductsArray.length){
                break;
            }
        }

        //click on cart
        driver.findElement(By.cssSelector(".cart-icon img")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".promoBtn")).click();
        String verify = "Code applied ..!";
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
        String promoVerification =driver.findElement(By.cssSelector(".promoInfo")).getText();
        Assert.assertEquals(verify,promoVerification);
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
