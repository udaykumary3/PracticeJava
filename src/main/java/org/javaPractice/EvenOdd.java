package org.javaPractice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd sam = new EvenOdd();
//        sam.evenOdd();
//        sam.swapNum();
        sam.swapString();
    }
    void evenOdd(){
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0 || num % 2 == 0) {
            System.out.println("num is even");
        } else {
            System.out.println("num is odd");
        }
    }
    void swapNum(){
        int a= 515,b= 999;
        a= a+b;
        b= a-b;
        a=a-b;
        System.out.println("value of a is "+a+" value of b is "+b);
    }
    void swapString(){
        String a ="UdayKumar";
        String b = "Yakala";
        a = a+b; //UdayKumarYakala
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("Value of a is "+a+" value of b is "+ b);
    }
}
