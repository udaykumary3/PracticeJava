package org.javaPractice.javaBasics;

public class ArrayComparision {
    public static void main(String[] args) {
        String[] arr = {"uday","kumar","yakala"};
        String[] brr = {"yakala","uday","kumar"};

        for (String s : arr) {
            for (String value : brr) {
                if (s.equals(value)) {
                    System.out.println("both arrays are same" + s);
                } else {
                    System.out.println("arrays are not same" + s);
                }
            }
        }
    }
}
