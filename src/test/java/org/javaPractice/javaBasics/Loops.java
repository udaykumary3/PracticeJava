package org.javaPractice.javaBasics;

public class Loops {

    public static void main(String[] args){
        int i =999;
        while (i>0){
            System.out.println("Value of I is :"+i);
            i--;
        }
        forLoop();
        doWhile();
        forEach();
        pattern();
    }

    public static void forLoop(){
        for(int i = 999; i >0; i--){
            System.out.println("Value of i is :"+i);
        }
    }

    public static void doWhile(){
        int i = 0;
        do {
            System.out.println("inside do");
            i++;
        }while (i >1);
    }

    public static void forEach(){
        int[] a = {1,2,3,4,5,6};
        for(int i:a){
            System.out.println("Value of i inside array is :"+ i);
        }
    }

    public static void pattern(){
        int k = 1;
        for (int i = 0; i < 4 ; i++) {
            for (int j = 1; j <4-i ; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println(" ");
        }
    }
}
