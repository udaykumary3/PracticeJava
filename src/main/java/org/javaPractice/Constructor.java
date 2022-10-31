package org.javaPractice;

public class Constructor {
    public Constructor() {
        System.out.println("im in default constructor");
    }

    public Constructor(String str, int a) {
        System.out.println("value of String is " + str + "and value of int is" + a + "");
    }

    public static void main(String[] args) {
        Constructor pr = new Constructor();
        Constructor pr1 = new Constructor("uday", 1);
    }
}
