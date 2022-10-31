package org.javaPractice.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class TotalBrokenLinks {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> totalElements = driver.findElements(By.cssSelector("li[class = 'gf-li'] a"));
        System.out.println(totalElements.size());
        int brokenlinkCounter = 0;

        for(int i= 0; i<totalElements.size(); i++){
            String url = totalElements.get(i).getAttribute("href");
            HttpURLConnection conn =(HttpURLConnection) new URL(url).openConnection();
            conn.connect();
            int respCode = conn.getResponseCode();

            if(respCode < 400 ){
                continue;
            }else{
                System.out.println("broken link is : "+totalElements.get(i).getText()+" is broken "+respCode);
                brokenlinkCounter+=1;
            }
        }
        System.out.println("broken links count : "+brokenlinkCounter);
        driver.close();
    }
}
