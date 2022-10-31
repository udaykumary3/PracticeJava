package org.javaPractice;

import java.util.Scanner;

public class PrimeFactorial {
    public static void main(String[] args) {
        PrimeFactorial pr = new PrimeFactorial();
//        pr.primeno();
        System.out.println(pr.prime());
//        pr.factorial();
//        pr.larg(98,999,1000);
    }

    boolean prime() {
        int num = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        if (n <= 1) {
            return false;
        }

        while (num * num <= n) {
            if (n % num == 0) {
                return false;
            }
            num++;
        }
        return num*num >n;
    }

    void primeno() {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        if (num == 0 || num == 1) {
            System.out.println("smallest prime number is 2");
        }
        for (i = 2; i < num; i++) {
            if (num % 2 == 0) {
                System.out.println("entered number is not prime");
                break;
            } else {
                System.out.println("entered number is prime");
                break;
            }
        }
        if (num == i) {
            System.out.println("Entered number is prime number");
        }
    }

    void factorial() {
        System.out.println("Enter number to check factorial ");
        Scanner sd = new Scanner(System.in);
        int num = sd.nextInt();
        int fac = 1;
        for (int i = 1; i <= 4; i++) {
            fac = fac * i;
        }
        System.out.println("Factorial of " + num + " is " + fac);
    }

    void largestNumber(int a, int b, int c) {
        int max = a;
        if (a < b) {
            max = b;
        }
        if (b < c) {
            max = c;
        }
        System.out.println("maximum number is " + max);
    }

    void larg(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        System.out.println("Largest number is " + max);
    }

}
