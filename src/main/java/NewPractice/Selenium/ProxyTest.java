package NewPractice.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProxyTest {

    @Test
    public void proxyTest(){
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("<HOST:PORT>");

        ChromeOptions options = new ChromeOptions();
        options.setCapability("proxy", proxy);
        options.setAcceptInsecureCerts(true);

        WebDriver driver = WebDriverManager.chromedriver().capabilities(options).create();
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl()+"------------------"+driver.getTitle()+"----------------"
        +driver.getPageSource());

        WebElement clickable = driver.findElement(By.id("clickable"));
        new Actions(driver)
                .moveToElement(clickable)
                .pause(Duration.ofSeconds(1))
                .clickAndHold().keyDown(Keys.ENTER)
                .pause(Duration.ofSeconds(1))
                .sendKeys("abc")
                .perform();

    }
}
