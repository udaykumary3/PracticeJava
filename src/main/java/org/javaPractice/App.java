package org.javaPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class App
{
    WebDriver driver;
    @Test(enabled = false)
    public void setUp() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C:/Users/udayk/Downloads/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chromedriver.chromium.org/downloads");
        String title = driver.getTitle();
        String currenturl =driver.getCurrentUrl();
        System.out.println("page Title is " + title + "page url is " + currenturl);
        Thread.sleep(3000);
    }

    @Test()
    public void newWebDriverManagerInit(){
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        WebDriver driver = WebDriverManager.chromedriver().capabilities(options).create();
        driver.get("https://chromedriver.chromium.org/downloads");
        System.out.println(driver.getTitle());
    }

    @AfterTest(enabled = false)
    public void afterRun(){
        driver.quit();
    }
}
