package org.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Locators {
    static WebDriver driver;

    public static void main(String[] args) {
        Locators loc = new Locators();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        //sign in with wrong creds
        driver.findElement(By.id("inputUsername")).sendKeys("Uday");
        driver.findElement(By.name("inputPassword")).sendKeys("inputPassword");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.cssSelector(".submit.signInBtn")).click();
        String errorText = driver.findElement(By.cssSelector("p.error")).getText();
        Assert.assertEquals("* Incorrect username or password", errorText);
        try {
            loc.forgotPawsord();
        } catch (Exception e) {
            System.out.println("error occured in try/catch block");
        }

        loc.quitBrowser();

    }

    public void quitBrowser() {
        driver.quit();
    }

    public void forgotPawsord() throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(text(),'Forgot your password?')]")).click();
        driver.findElement(By.cssSelector("[placeholder='Name']")).sendKeys("uday");
        driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("uday");
        driver.findElement(By.cssSelector("[placeholder='Phone Number']")).sendKeys("12456");
        try {
            driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".reset-pwd-btn")));
        }
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector(".infoMsg")).getText();
        String strPattern = "'([^']*)'";

        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(passwordText);
        String mas = null;
        while (matcher.find()) {
            String usepswrd = matcher.group(1);
            mas = usepswrd;
        }
        String name = "uday";
        driver.findElement(By.className("go-to-login-btn")).click();
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(mas);
        Thread.sleep(3000);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.cssSelector(".submit.signInBtn")).click();
        String txt = driver.findElement(By.xpath("//*[@class='login-container']/h2")).getText();
        Assert.assertEquals(txt,"Hello "+name+",");
        System.out.println("Program Executed Successfully");
    }
}
