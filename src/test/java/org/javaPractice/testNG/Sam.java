package org.javaPractice.testNG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sam {
    public static void main(String[] args) {
        List<Integer> ara = Arrays.asList(1,2,3,4,5);
        List som = ara.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(som);
//        ara.stream().map(e -> e ).max
        largest();
        a("a",1);
        a(1,"a");
    }

    static void largest(){
        int [] arr = {1,2,3,4,5};

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("largest value is "+largest);
    }

    static void a (String a, int b){

    }

    static void a (int s, String b){



    }
}
