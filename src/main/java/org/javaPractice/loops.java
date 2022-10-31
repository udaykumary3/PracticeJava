package org.javaPractice;

public class loops {
    public static void main(String[] args) {
//        whileLoop();
//        forLoop();
        nestedLoop();
    }


    public static void whileLoop() {
        int a = 10;
        int i = 100;
        while (i >= a) {
            System.out.println(i);
            i--;
        }
    }

    public static void forLoop() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("printing " + i);
        }
    }

    public static void nestedLoop() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
