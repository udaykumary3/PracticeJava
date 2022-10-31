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
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinks {
    static WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    public void brokenLinks() throws IOException {
        WebElement footer = driver.findElement(By.id("gf-BIG"));
        List<WebElement> links = footer.findElements(By.tagName("a"));
        System.out.println(links.size());
        SoftAssert ass = new SoftAssert();
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            HttpURLConnection linkConnect = (HttpURLConnection) new URL(url).openConnection();
            linkConnect.setRequestMethod("HEAD");
            linkConnect.connect();
            int respCode = linkConnect.getResponseCode();
//            ass.assertTrue(respCode < 400,"The link with text " + link.getText() + " with response code " + respCode + " is broken");
        }
        ass.assertAll();
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
