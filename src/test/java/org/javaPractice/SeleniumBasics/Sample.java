package org.javaPractice.SeleniumBasics;

import java.util.Arrays;

public class Sample {
    public static int count = 0;

    public Sample(){
        count+=1;
    }
    static String name = " hello 'Uday'! How are' you";

    public static void main(String[] args) {
        String[] afterSplit = name.split("'");
        System.out.println(Arrays.toString(afterSplit));

    }
}
