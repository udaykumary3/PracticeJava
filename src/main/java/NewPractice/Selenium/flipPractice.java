package NewPractice.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class flipPractice {

    @Test
    public void test() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true);
        options.addArguments("--incognito");
        WebDriver driver = WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']")).click();
        TimeUnit.SECONDS.sleep(5);

        List<String> expectedList = Arrays.asList("Mobiles","Fashion","Electronics","Beauty", "Home","Large","Furniture", "Travel", "Grocery");

        List<WebElement> listOfElements = driver.findElements(By.xpath("//div[@class ='_1mkliO']/div/img"));
        List<String> actualList = new ArrayList<>();
        for (WebElement elem:listOfElements
             ) {
            System.out.println(elem.getAttribute("alt"));
            actualList.add(elem.getAttribute("alt"));
        }
        Assert.assertEquals(expectedList,actualList);
    }
}
