package NewPractice.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {
    static WebDriver driver;

    @BeforeTest
    public void startUp(){
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        //implicitly Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("selenium");
        Thread.sleep(5000);
        List<WebElement> searchItems = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
        System.out.println("size of list is "+ searchItems.size());
        for (WebElement elem:searchItems) {
//            System.out.println(elem.getAttribute("innerHTML"));
            System.out.println(elem.getText());
            if(elem.getText().contains("selenium interview questions")){
                elem.click();
                break;
            }
        }
        TimeUnit.SECONDS.sleep(1);
        Thread.sleep(2000);
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
