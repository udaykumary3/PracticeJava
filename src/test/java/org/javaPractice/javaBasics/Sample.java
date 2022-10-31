package org.javaPractice.javaBasics;

public interface Sample {
    int a = 5;
    static void test() {
        System.out.println("inside static");
    }

    void testMethod(String test);

    default void defaultMethod(){
        System.out.println("inside default method");
    }

    public static void main(String[] args) {
        System.out.println("inside interface");
        Sample sa = new Sample() {
            @Override
            public void testMethod(String test) {
                System.out.println("inside main");
            }
        };
    }
}
