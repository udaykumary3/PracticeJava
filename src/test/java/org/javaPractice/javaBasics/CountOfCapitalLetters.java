package org.javaPractice.javaBasics;

import java.util.Scanner;

public class CountOfCapitalLetters {
    public static void main(String[] args) {
        countOfCapitals();
    }

    public static void countOfCapitals(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new word");
        String word = sc.nextLine();
        String capitals = "";
        String small = "";
        String other = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                capitals = capitals+ch;
            }else if(ch >= 'a' && ch <= 'z'){
                small = small+ch;
            }else{
                other = other+ch;
            }
        }

        System.out.println("Captials in entered word are : "+ capitals+ " and count of it is :"+ capitals.length());
        System.out.println("Smalls in entered word are : "+ small+ " and count of it is :"+ small.length());
        System.out.println("Other symbols in entered word are : "+ other+ " and count of it is :"+ other.length());
    }
}
