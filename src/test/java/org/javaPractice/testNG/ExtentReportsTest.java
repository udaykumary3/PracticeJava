package org.javaPractice.testNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExtentReportsTest {
    public ExtentReports reports;

    @BeforeTest
    public void config(){
        String path = System.getProperty("user.dir")+"\\reports\\index.html";
        System.out.println("path directory :"+path);
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Uday Automation Results");
        reporter.config().setDocumentTitle("Test Results by Uday");

        reports = new ExtentReports();
        reports.attachReporter(reporter);
        reports.setSystemInfo("Tester", "Uday");
    }

    @Test
    public void openBrowser(){
        ExtentTest test =reports.createTest("open Browser");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/#/index");
        System.out.println(driver.getTitle());
        driver.close();
        test.fail("Not matching with expected result");
        reports.flush();
    }
}
