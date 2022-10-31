package org.pract;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
//        arr();
        System.out.println(minValue());
    }

    static void arr(){
        int[][] twoArray = {
                {2,3,1},{4,3,2},{5,4,6},{9,5,6}
        };
        for (int[] ints : twoArray) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }

    static int minValue(){
        int[][] twoArray = {
                {2,3,1},{4,3,2},{5,4,6},{9,5,6}
        };
        int min = twoArray[0][0];

        for (int row = 0; row < twoArray.length ; row++) {
            for (int col = 0; col < twoArray[row].length; col++) {
                if(twoArray[row][col]< min){
                    min = twoArray[row][col];
                }
            }
        }
        return min;
    }
}
