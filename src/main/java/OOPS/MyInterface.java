package OOPS;

public interface MyInterface {
    void method1();
    default void method2(){
        System.out.println("");
    }
    static void method3(){
        System.out.println("static method");
    }
}
