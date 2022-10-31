package OOPS;

import org.javaPractice.Samp;

public class Sampl extends Samp {


    public static void main(String[] args) {
        String value1 = "Hello";
        String value2 = new String("Hello");
        System.out.print(value1 == value2);
        System.out.print(" ");
        String value3 = value2.intern();
        System.out.println(value1 == value3);
        Samp sa = new Sampl();
        sa.inheritThisMethod();
        String cl = sa.color;
    }
}
