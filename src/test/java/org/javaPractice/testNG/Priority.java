package org.javaPractice.testNG;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 3)
    public void mango()
    {
        System.out.println("I am Mango");
    }
    @Test(priority=2)
    public void apple()
    {
        System.out.println("I am Apple");
    }
    @Test(priority=1)
    public void watermelon()
    {
        System.out.println("I am Watermelon");
    }
    @Test()
    public void watermelons()
    {
        System.out.println("I am Watermelons");
    }
    @Test(priority=-5)
    public void negativePriority()
    {
        System.out.println("I am negative priority");
    }
}
