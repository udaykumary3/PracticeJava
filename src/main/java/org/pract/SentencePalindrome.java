package org.pract;

import java.util.Locale;
import java.util.Scanner;

public class SentencePalindrome {
    public static void main(String[] args) {
        System.out.println("Enter sentence!!");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String end = "";
        String replace = sentence.replace(" ","");
        System.out.println(replace);
        for (int i = 0; i < replace.length(); i++) {
            end = replace.charAt(i)+ end;
        }
        if(replace.equalsIgnoreCase(end)){
            System.out.println(" Entered sentence is a palindrome ");
        }else{
            System.out.println(" Not Palindrome");
        }

    }
}
