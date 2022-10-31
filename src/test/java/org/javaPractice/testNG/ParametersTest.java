package org.javaPractice.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Parameters({"browser","environment"})
    @Test
    public void getParameters(String browserName, String envName){
        System.out.println(browserName+ " "+ envName);
    }
}
