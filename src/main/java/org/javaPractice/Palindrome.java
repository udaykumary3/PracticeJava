package org.javaPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome pa = new Palindrome();
//        pa.palindrome();
        pa.numPalindrome();
        System.out.println("Enter text");
        Scanner sc = new Scanner(System.in);

        String ab = sc.nextLine();
        String rev = "";
        char ch;
        for (int i = 0; i < ab.length(); i++) {
            ch = ab.charAt(i);
            rev = ch + rev;
        }
        System.out.println("reverse of string is " + rev);
        if (ab.equals(rev)) {
            System.out.println("text sent is palindrome");
        } else {
            System.out.println("text sent is not palindrome");
        }
    }

    void palindrome() {
        String sa = "arara";
        StringBuffer sb = new StringBuffer();
        sb.append(sa);
        sb.reverse();
        System.out.println(sb);
        String sc = sb.toString();
        if (sa.equalsIgnoreCase(sc)) {
            System.out.println("Entered text is palindrome");
        } else {
            System.out.println("not a palindrome");
        }

    }
    void numPalindrome(){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev= 0;

        while(num != 0){
            int rem= num %10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println("reverse of number is : "+rev);

        if(num == rev){
            System.out.println("Entered number is palindrome");
        }else{
            System.out.println("Entered number is not palindrome");
        }

    }
}

