package org.javaPractice.SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Waits {
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        implicitly wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://www.google.co.in");
//        ExplicitlyWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement elem = driver.findElement(By.id("a"));
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("a")));
//        wait.until(ExpectedConditions.alertIsPresent());
//        wait.until(ExpectedConditions.attributeContains(elem,"url","google"));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("a")));
        driver.quit();
    }
}
