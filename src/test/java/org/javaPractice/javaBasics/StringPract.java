package org.javaPractice.javaBasics;

import org.javaPractice.SeleniumBasics.Sample;

import java.util.Arrays;

public class StringPract {
    static String name = "uday kumar is a good boy";
    private static String as;

    public static void main(String[] args) {
        String arr[] = name.split(" ");
        as = Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));
        Sample sa = new Sample();
        Sample sa1 = new Sample();
        Sample sa2 = new Sample();
        Sample sa3 = new Sample();
        System.out.println("Object created are : "+Sample.count);
    }
}
