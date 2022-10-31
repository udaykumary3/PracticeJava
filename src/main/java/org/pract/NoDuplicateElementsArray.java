package org.pract;

import java.util.*;

public class NoDuplicateElementsArray {
    public static void main(String[] args) {
//    dupArray();
//        setsArray();
        setArray();
    }

    static void setArray() {
        Integer[] arr = {1,2,33,22,2,12,34,4,65,22,33,7,8,99,4};
        List<Integer> lis = Arrays.asList(arr);
        Set<Integer> se = new HashSet<Integer>(lis);
        System.out.println(se);
        System.out.println("length of array before  is "+arr.length+" length of array after is "+se.size());
        Object[] newArray =se.toArray();
    }

    static void dupArray(){
        int[] arr = {1,2,33,22,2,12,34,4,65,22,33,7,8,99,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> li = new ArrayList<>();
        int j = 0;
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                brr[j] = arr[i];
                li.add(arr[i]);
                j++;
            }
        }
        brr[j] = arr[arr.length-1];
        li.add(arr[arr.length-1]);
        Object[] newArr = li.toArray();
        System.out.println(li);
        for (int k = 0; k < newArr.length; k++) {
            System.out.println(brr[k]);
        }
    }
    static void setsArray(){
        int[] arr = {1,2,33,22,2,12,34,4,65,22,33,7,8,99,4};
        HashSet<Integer> se = new HashSet<Integer>();
        ArrayList<Integer> sam = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            se.add(arr[i]);
        }
        System.out.println(se);
    }
}
