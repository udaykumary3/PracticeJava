package org.javaPractice.javaBasics;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] twoArray = {{9,2},{3,4},{5,4},{6,1}};
        int min = twoArray[0][0];
        int max = twoArray[0][0];

        for (int row = 0; row < twoArray.length; row++) {
            for (int column = 0; column < twoArray[row].length; column++) {
                if(twoArray[row][column]<min){
                    min = twoArray[row][column];
                }
                if(twoArray[row][column]>max){
                    max = twoArray[row][column];
                }
            }
        }
        System.out.println(min+" "+max);
        maxNumberInSameColumnWhichHasMinNumber();
    }

    public static void maxNumberInSameColumnWhichHasMinNumber(){
        int[][] matrix = {
                {2,5,3,7},
                {21,46,53,3},
                {34,5,7,93}
        };
        int min = matrix[0][0];
        int max = matrix[0][0];
        int colNum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] < min){
                    min = matrix[row][col];
                    colNum = col;
                }
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            if(matrix[row][colNum] > max){
                max = matrix[row][colNum];
            }
        }
        System.out.println("maximum value in column "+colNum+" which has the least value is : "+max);
    }
}
