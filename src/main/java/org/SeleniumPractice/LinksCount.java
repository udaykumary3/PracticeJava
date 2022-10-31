package org.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class LinksCount {
    static WebDriver driver;
    @BeforeTest
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }
    @Test
    public void linksCount() throws InterruptedException {
        int count = driver.findElements(By.tagName("a")).size();
        System.out.println("no. of links in this page are "+count);
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        int footerCount = footerDriver.findElements(By.tagName("a")).size();
        System.out.println("no. of elements in footer section is "+footerCount);
        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        int columnLinks = columnDriver.findElements(By.tagName("a")).size();
        System.out.println("no. of links in 1st column are "+columnLinks);
        for (int link = 0; link < columnLinks; link++) {
            String keysClick = Keys.chord(Keys.CONTROL,Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(link).sendKeys(keysClick);
        }
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);
        Iterator<String> it = windows.iterator();
        while (it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
