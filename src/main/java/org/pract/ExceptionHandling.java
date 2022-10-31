package org.pract;

public class ExceptionHandling {
    public static void main(String[] args) {
        divides(2,0);
    }
    static void divide(int a, int b){
        try{
            int c=a/b;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    static int divides(int a,int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}
