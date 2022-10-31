package org.javaPractice.javaBasics;


import java.util.ArrayList;

public class UniqueNumberInArray {
    public static void unique(){
        int[] arr = {2,4,3,2,4,6,6,7,4,7,8,9,8};

        ArrayList<Integer> ars = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if(!ars.contains(arr[i])){
                ars.add(arr[i]);
                count++;
            }
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(arr[i]+ " is unique number");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        unique();
    }
}
