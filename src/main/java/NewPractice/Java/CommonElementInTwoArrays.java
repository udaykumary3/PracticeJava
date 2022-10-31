package NewPractice.Java;

import java.util.HashSet;

public class CommonElementInTwoArrays {
    public static void main(String[] args) {
        int[] arr = {23, 43,11,24};
        int[] brr = {32,11,34,7, 23};

        printIntersection(arr, brr);
    }

    private static void printIntersection(int[] arr, int[] brr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }

        for (int i = 0; i < brr.length; i++) {
            if (hs.contains(brr[i])){
                System.out.println("common elements in two arrays are : "+brr[i]);
            }
        }
    }
}
