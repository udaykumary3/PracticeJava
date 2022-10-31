package org.javaPractice.testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GroupsTest {
    SoftAssert sof = new SoftAssert();


    @Test(groups = {"smoke", "regression"})
    public void mobileTest(){
        System.out.println("inside mobile");
        sof.assertTrue(true);
        sof.assertAll();
    }

    @Test(groups = "smoke")
    public void laptopTest(){
        System.out.println("inside laptop");
    }

    @Test(groups = "regression")
    public void iphoneTest(){
        System.out.println("inside iphone");
    }

    @Test(groups = "sanity")
    public void googleTest(){
        System.out.println("inside google");
    }

    @Test(timeOut = 5000, priority = 1, enabled = true)
    public void microsoftTest(){
        System.out.println("inside microsoft");
    }
}
