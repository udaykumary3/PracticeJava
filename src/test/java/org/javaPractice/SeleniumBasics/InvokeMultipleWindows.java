package org.javaPractice.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        String parentWindow = driver.getWindowHandle();
//        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
        String childWindow = driver.getWindowHandle();

        driver.switchTo().window(childWindow);
        driver.get("https://rahulshettyacademy.com");
        driver.switchTo().window(parentWindow);
        System.out.println("parent window : "+parentWindow+ System.lineSeparator() +"child window : "+childWindow);
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
    }
}
