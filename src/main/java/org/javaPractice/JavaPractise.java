package org.javaPractice;

import java.util.ArrayList;

public class JavaPractise {
    public static void main(String[] args) {
        JavaPractise je = new JavaPractise();
        mers();
        mers();
        int[] a = {1,4,2,35,2};
        String[] stringarr = {"uday","kumar","yakala"};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("length of a is "+ a.length);

        for(String s:stringarr){
            System.out.println(s);
        }
        System.out.println("******************************************");
        ArrayList<String> arra = new ArrayList<String>();
        arra.add("social");
        arra.add("science");
        arra.add("maths");
        for(int d=0;d<arra.size();d++){
            System.out.println(arra.get(d));
        }
    }
    public static void mers(){
        System.out.println("inside method");
    }
}
