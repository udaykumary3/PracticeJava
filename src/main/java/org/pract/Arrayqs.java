package org.pract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayqs {
    public static void main(String[] args) {
//        arrayMix();
        mergeArray();
    }

    static void mergeArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Values to be in first array : ");
        String[] arr = new String[6];
        int[] brr = new int[6];
        for (int first = 0; first < arr.length; first++) {
            arr[first] = sc.nextLine();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("enter values to be in second array : ");
        for (int second = 0; second < brr.length ; second++) {
            brr[second] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(brr[i]);
        }
    }

    static void arrayMix(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Values to be in first array : ");
        int[] arr = new int[6];
        int[] brr = new int[9];
        for (int first = 0; first < arr.length ; first++) {
            arr[first] = sc.nextInt();
        }
        System.out.println();
        System.out.print("enter values to be in second array : ");
        for (int second = 0; second < brr.length ; second++) {
            brr[second] = sc.nextInt();
        }
        int[] mix = new int[arr.length+brr.length];
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            mix[i] = arr[i];
            count++;
        }
        for (int j = 0; j < brr.length; j++) {
            mix[count] = brr[j];
            count++;
        }
        System.out.println(Arrays.toString(mix));
    }
}
