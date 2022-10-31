package org.pract;

public class Dup {
    public static void main(String[] args) {
//        armStrong(153);
//        System.out.println(armStrong());
//        fibonacci(10);
        repString();
    }

    static boolean armStrong(int num) {
        int sum = 0;
        int rem = 0;
        int original = num;

        while (num > 0) {
            rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }
        if (sum == original) {
            return true;
        }
        return false;
    }

    static void fibonacci(int num) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < num; i++) {
            n3 = n2 + n1;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3; //0 1 1 2 3 5 8 13 21 34
        }
    }

    static void repString() {
        String val = "uday kumar";
        char[] ch = val.toCharArray();
        for (char i : ch) {
            if (val.indexOf(i) == val.lastIndexOf(i)) {
                System.out.println("first repetitive character in staring is " + i);
                break;
            }
        }
    }
}
