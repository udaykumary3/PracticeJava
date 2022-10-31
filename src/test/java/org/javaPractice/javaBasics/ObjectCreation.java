package org.javaPractice.javaBasics;

public class ObjectCreation {
    public static void main(String[] args) {
        ClassInvokeCount cc = new ClassInvokeCount();
        ClassInvokeCount sc = new ClassInvokeCount();
        ClassInvokeCount ac = new ClassInvokeCount();

        System.out.println(ClassInvokeCount.count);
    }
}
