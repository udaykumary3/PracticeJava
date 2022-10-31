package org.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//static
        WebElement statDrp = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select sl = new Select(statDrp);
        sl.selectByVisibleText("USD");
        System.out.println(sl.getFirstSelectedOption().getText());
//loop dropdwn
        driver.findElement(By.id("divpaxinfo")).click();
//        driver.findElement(By.id("hrefIncAdt")).click();
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        driver.findElement(By.id("btnclosepaxoption")).click();

        //dynamic dropdown
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//*[text()=' Mumbai (BOM)']")).click();
//        driver.findElement(By.xpath("//a[@value = 'MAA'][2]")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys(Keys.ENTER);

        //autosuggestion
        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        Thread.sleep(3000);
        List<WebElement> options =driver.findElements(By.cssSelector("li[class ='ui-menu-item'] a"));
        for(WebElement i:options){
            if(i.getText().equalsIgnoreCase("india")){
                System.out.println("country name " +i.getText());
                i.click();
                break;
            }
        }


        Thread.sleep(5000);
        closeBrowser(driver);
    }

    public static void closeBrowser(WebDriver driver) {
        driver.quit();
    }
}
