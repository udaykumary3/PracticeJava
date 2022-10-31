package org.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

public class AjaxMouseTest {
    static WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    public void ajaxCall(){
        Actions act = new Actions(driver);
        WebElement sign = driver.findElement(By.cssSelector("#nav-link-accountList"));
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        act.moveToElement(sign).build().perform();
        act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("samsung").build().perform();
        act.moveToElement(search).click().sendKeys("samsung").build().perform();
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
