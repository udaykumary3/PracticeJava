package org.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class windowPract {
    static WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Test
    public void test(){
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> windowId = driver.getWindowHandles();
        Iterator<String> itr = windowId.iterator();
        String parentWindow = itr.next();
        String childWindow = itr.next();
        driver.switchTo().window(childWindow);
        System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
        driver.switchTo().window(parentWindow);
        System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
