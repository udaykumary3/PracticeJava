package org.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

public class SSLCertificates_Screenshot {
    public static void main(String[] args) throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        ChromeOptions option = new ChromeOptions();
//        can also be done by using below line
//        option.setAcceptInsecureCerts(true);
        option.merge(cap);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //To take full page screenshot
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\udayk\\OneDrive\\Desktop\\screenshots\\screenshot.png"));
        driver.quit();
    }
}
// To take particular element screenshot
//File src = WebElement.getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(src,new File("C:\\Users\\udayk\\OneDrive\\Desktop\\screenshots\\screenshot.png"));