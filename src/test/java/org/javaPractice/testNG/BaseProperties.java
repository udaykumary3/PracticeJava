package org.javaPractice.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseProperties {

    public WebDriver driver;

    public WebDriver initializeDriver() {

        Properties prop = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/test/resources/TestDetails.properties");
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String browserName = prop.getProperty("browser");
        System.out.println("name of browser is : " + browserName);

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equals("edge")) {
            System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("not a valid browser name");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        return driver;

    }
}

