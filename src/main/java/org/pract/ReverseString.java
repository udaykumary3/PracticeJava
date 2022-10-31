package org.pract;

public class ReverseString {
    public static void main(String[] args) {
        String original = "uday kumar is a good boy";
        //String Buffer
        StringBuffer sb = new StringBuffer();
        sb.append(original);
        sb.reverse();
        String changedByStringBuffer = sb.toString();
        System.out.println("changed by string buffer value is "+changedByStringBuffer);
        // another method
        String rev= " ";
        for (int i = 0; i < original.length(); i++) {
            rev = original.charAt(i)+rev;
        }
        System.out.println("reverse of string by using for loop "+ rev);

    }
}
