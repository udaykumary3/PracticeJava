package org.javaPractice.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://qaclickacademy.com/practice.php");
        Actions act = new Actions(driver);
        WebDriverWait expWait = new WebDriverWait(driver,Duration.ofSeconds(30));

        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        List<WebElement> footerDriverLinks = footerDriver.findElements(By.tagName("a"));

        for(int i= 0; i<footerDriverLinks.size(); i++){
            String multipleTabs = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footerDriver.findElements(By.tagName("a")).get(i).sendKeys(multipleTabs);
        }

        Thread.sleep(10000);

        Set<String> windowDetails = driver.getWindowHandles();
        Iterator<String> windows = windowDetails.iterator();

//        while(windows.hasNext()){
//            driver.switchTo().window(windows.next());
//            String pageTitle = driver.getTitle();
//            System.out.println(pageTitle);
//        }

        for(String s: windowDetails){
            driver.switchTo().window(s);
        }

        List<String> winList = new ArrayList<>();
        winList.addAll(windowDetails);

        for(int i=0;i<winList.size();i++){
            driver.switchTo().window(winList.get(i));
            System.out.println(driver.getTitle());
        }

        driver.quit();
    }
}
