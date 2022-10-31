package org.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DayOne {
    @Test
    public void tryTest(){
        System.out.println("Inside Test");
    }
    @Test(dataProvider = "getData")
    public void tryTests(String usrName,String pwd){
//        System.out.println("Inside Test Again");
        System.out.println("Username is "+usrName+" password is "+pwd);
    }
    @DataProvider
    public Object[][] getData(){
        Object[][] userDetails = new Object[3][2];
        userDetails[0][0] = "firstuser";
        userDetails[0][1] = "firstpwd";
        userDetails[1][0] = "seconduser";
        userDetails[1][1] = "secondpwd";
        userDetails[2][0] = "thirduser";
        userDetails[2][1] = "thirdpwd";
        return userDetails;
    }
}
