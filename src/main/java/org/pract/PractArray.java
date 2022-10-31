package org.pract;

import java.util.*;
import java.util.stream.Collectors;

public class PractArray {
    public static void main(String[] args) {
//        arrayDup();
        setArray();
    }

    static void arrayDup(){
        int[] arr = {1,2,3,2,3,4,5,1};
        Arrays.sort(arr);
        int j = 0;
        ArrayList<Integer> dupArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]!=arr[i+1]) {
                dupArr.add(arr[i]);
                j++;
            }
        }
        System.out.println(dupArr);
    }

    static void setArray(){
        int[] arr = {1,2,3,2,3,4,5,1};
        List<Integer> brr = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(brr);
        Set<Integer> se = new HashSet<Integer>();
        se.addAll(brr);
        System.out.println(se);
    }
}
