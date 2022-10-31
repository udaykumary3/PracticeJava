package org.pract;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Arrays of integers : ");
        int [] arr = new int[7];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("values in array is "+ Arrays.toString(arr));
        minimumNumber(arr);
        maximumNumber(arr);
    }

    static void minimumNumber(int[] ar){
        int min = ar[0];

        for (int element:ar) {
            if(element< min){
                min = element;
            }
        }
        System.out.println("Minimum Value in array is "+ min);
    }

    static void maximumNumber(int[] sam){
        int max = sam[0];
        for (int j : sam) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Maximum number in array is "+ max);
    }
}

