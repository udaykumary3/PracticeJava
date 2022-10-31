package org.javaPractice.javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysSample {
    public static void main(String[] args){
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println(Arrays.toString(a));
        Arrays.stream(a).forEach(s -> System.out.println(s));

        int[] b = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> arc = new ArrayList<>(Arrays.asList(1,3,2,4));
        List<Integer> ase =  Arrays.stream(a).boxed().collect(Collectors.toList());
        listSample(ase);

        String[] bd = {"uday", "kumar", "yakala"};
        List<String> an = Arrays.stream(bd).collect(Collectors.toList());
        listSample1(an);
        arrayToList();
    }

    public static void listSample(List<Integer> ars){
        ArrayList<Integer> lis = new ArrayList<>();
        lis.addAll(ars);
        System.out.println("value is "+ars);
    }

    public static void listSample1(List<String> arp){
        ArrayList<String> lis = new ArrayList<>();
        lis.addAll(arp);
        System.out.println("value is "+arp);
    }

    public static void arrayToList(){
        String[] m = {"a", "b"};
        List<String> l = Arrays.asList(m);
        System.out.println(l);
    }

}
