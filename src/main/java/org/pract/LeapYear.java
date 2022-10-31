package org.pract;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter Year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(leapYear(year));
        int count=0;
        for (int i = 2000; i < 3000; i++) {
            if(leapYear(i)){
                System.out.println("leapYearsList is "+ i);
                count++;
            }
        }
        System.out.println("No. of leap years in specified range is "+count);
    }
    static boolean leapYear(int year){
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400==0){
                    return true;
                }else{
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
