package org.javaPractice.javaBasics;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueNumberArray {
    public static void uniqueNumber(int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("duplicate element found : "+arr[i]);
                    flag = true;
                }
            }
        }

        if (flag == false) {
            System.out.println("duplicate element not found");
        }
    }

    public static void usingHashSet(String[] as){
        HashSet<String> hs = new HashSet<>();
        boolean flag = false;
        for (String ar:as) {
            if(hs.add(ar)==false){
                System.out.println("found duplicate element : "+ar);
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("duplicate items not found");
        }
    }

    public static void main(String[] args) {
        int[] brr = {1,2,3,4,5};
        String[] mr = {"uday", "kumar","yakala","nani"};
        uniqueNumber(brr);
        usingHashSet(mr);
    }
}
