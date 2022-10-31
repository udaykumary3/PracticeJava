package org.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class JavaScriptExecution {
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
    public void javaScriptExecutor() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
//        js.executeScript("alert('Welcome Uday');");
//        based on webelement scroll
//        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
//       to get the height of the webpage and scroll to the end
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//       to specify the WebElement till which the page has to be scrolled
//        js.executeScript("arguments[0].scrollIntoView();", element);
//        to specify the number of pixels the page has to be scrolled
//        js.executeScript("window.scrollBy(0,3000)");
//       to scroll to left horizontally in a page
//        js.executeScript("window.scrollBy(6000,0)")
//       to scroll to right horizontally in a page
//        js.executeScript("window.scrollBy(2000,0)");
//       to scroll both horizontal and vertical in a page
//        js.executeScript("window.scrollBy(6000,50)");
        /* scroll to top
        anyone line below will work to scroll to top*/
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
        js.executeScript("window.scrollTo(0,0)");
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

        Thread.sleep(3000);
        int value = 0;
        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        for (int i = 0; i < values.size(); i++) {
            value += Integer.parseInt(values.get(i).getText());
        }
        System.out.println("Sum of values " + value);
        String compare = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
        int expectedValue = Integer.parseInt(compare);
        System.out.println(expectedValue);
        Assert.assertEquals(value, expectedValue);
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
