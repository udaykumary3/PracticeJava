package org.javaPractice.javaBasics;

public class Child extends Parent {
    String name = "uday";


    public Child() {
        super();
        String col = super.color;
    }

    public String getColor(){
        String col = super.getColor();
        return col;
    }

    public static void main(String[] args) {
        Child ch = new Child();
        ch.getColor();
    }

    public static final void name(){

    }
}
