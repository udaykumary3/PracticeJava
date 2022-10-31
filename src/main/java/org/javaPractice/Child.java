package org.javaPractice;

public class Child extends Parent {
    String name = "ramayan";

    public static void main(String[] args) {
        Child ch = new Child();
        ch.getData();
    }

    public void getData() {
        System.out.println(name);
        System.out.println(super.name);
    }
    
}
