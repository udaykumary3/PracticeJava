package org.pract;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String pal = sc.nextLine();
        newPalindrome(pal);
        System.out.println(newPalindrome(pal));
    }
    static boolean newPalindrome(String st){

        String rev = st.toLowerCase();
        int start;
        for(start =0;start<rev.length();start++){
            char str = rev.charAt(start);
            char en = rev.charAt(rev.length()-1-start);
            if(str != en){
                return false;
            }
        }
        return true;
    }
}

