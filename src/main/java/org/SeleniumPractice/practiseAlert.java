package org.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class practiseAlert {
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
    public void testAlert(){
        WebElement radio = driver.findElement(By.id("checkBoxOption2"));
        radio.click();
        String radioValue = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        System.out.println("value of option selected : "+radioValue);
        WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
        Select value = new Select(dropDown);
        value.selectByVisibleText(radioValue);
        driver.findElement(By.id("name")).sendKeys(radioValue);
        driver.findElement(By.id("alertbtn")).click();
        Alert al = driver.switchTo().alert();
        String alertText = al.getText();
        if(alertText.contains(radioValue)){
            System.out.println("successfully added text");
        }else{
            System.out.println("unsuccessful");
        }
        al.accept();
//        al.sendKeys("");
//        al.dismiss();
//        al.getText();
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
