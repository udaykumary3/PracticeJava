package org.javaPractice.javaBasics;

public class ImplementsInterface implements Sample {

    @Override
    public void testMethod(String test) {
        System.out.println(test);
    }

    public void dummy(){
        System.out.println("inside dummy method");
    }

    public static void main(String[] args) {
        Sample sam = new ImplementsInterface();
        sam.defaultMethod();
        sam.testMethod("in interface");
        System.out.println(sam.a);
        ImplementsInterface Ii = new ImplementsInterface();
        Ii.dummy();
    }
}
