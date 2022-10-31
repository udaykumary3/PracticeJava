package org.javaPractice.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends BaseProperties {

    @Test
    public void launchBrowser() {
        driver = initializeDriver();
        driver.get("https://www.google.co.in");
    }
}
