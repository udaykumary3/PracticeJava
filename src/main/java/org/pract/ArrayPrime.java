package org.pract;

import java.util.Scanner;

public class ArrayPrime {
    public static void main(String[] args) {
        arrayPrime();
    }

    static void arrayPrime() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Arrays of six numbers to check prime number: ");
        int[] arr = new int[6];
        for (int values = 0; values < arr.length; values++) {
            arr[values] = input.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            if (prime(arr[j])){
                System.out.println(arr[j]);
            }
        }
    }

    static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while (c * c < num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > num;
    }
}
