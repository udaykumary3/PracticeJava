package OOPS;

public class MainMethod {
    public static void main(String[] args) {
        AbstractExample obj = new AbstractExtends();
        obj.method2();
        obj.method();
        MyInterface obj1 = new MyImplementation();
        MyInterface.method3();
//        obj1.method1();
//        Bike bk = new Bike();
        Pract pr = new Pract();
//        pr.method();

    }
}
