package org.javaPractice.javaBasics;

public class Exceptions {
    int a;
    int b;

    public Exceptions(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void exceptions(){
        try{
            int c = a/b;
        }catch (Exception e){
            System.out.println("Exception caught is : "+e.getMessage());
        }finally {
            System.out.println("inside finally");
        }
    }

    public static void main(String[] args){
        Exceptions ex = new Exceptions(5,0);
        ex.exceptions();
    }
}
