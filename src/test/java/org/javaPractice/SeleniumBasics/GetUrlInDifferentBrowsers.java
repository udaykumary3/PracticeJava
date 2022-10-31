package org.javaPractice.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GetUrlInDifferentBrowsers {
    public static void main(String[] args) {
//        getURLInChrome();
//        getURLInEdge();
        getURLInFirefox();
    }

    public static void getURLInChrome() {
        System.out.println("in method");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        driver.get("https://rahulshettyacademy.com/#/index");
        String title = driver.getTitle();
        System.out.println("title of the page is "+title);
        driver.close();
    }

    public static void getURLInEdge() {
        System.out.println("in method");
        System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/#/index");
        String title = driver.getTitle();
        System.out.println("title of the page is "+title);
        driver.close();
    }

    public static void getURLInFirefox() {
        System.out.println("in method");
        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/#/index");
        String title = driver.getTitle();
        System.out.println("title of the page is "+title);
        driver.close();
    }
}
