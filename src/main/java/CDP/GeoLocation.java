package CDP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.emulation.Emulation;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GeoLocation {
    @Test
    public void geoLocationTest(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        Map<String,Object> coordinates = new HashMap<String,Object>();
        coordinates.put("latitude",40);
        coordinates.put("longitude",3);
        coordinates.put("accuracy",1);

//        driver.manage().window().maximize();
        driver.executeCdpCommand("Emulation.setGeolocationOverride",coordinates);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
        driver.findElements(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).get(0).click();
        String text= driver.findElement(By.cssSelector(".our-story-card-title")).getText();
        System.out.println(text);
        devTools.close();
    }

    @Test
    public void geoLocationTestUsingSeleniumMethod(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        devTools.send(Emulation.setGeolocationOverride(Optional.of(40), Optional.of(3), Optional.of(1)));

        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
        driver.findElements(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).get(0).click();
        String text= driver.findElement(By.cssSelector(".our-story-card-title")).getText();
        System.out.println(text);
    }
}
