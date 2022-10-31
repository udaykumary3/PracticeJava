package org.javaPractice.testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicTestNG {

    @Test(description = "Opening Browser and closing it")
    public void run(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.close();
    }

    @Test(invocationCount = 1)
    public void test(){
        System.out.println("inside Test");
    }
}
