package org.javaPractice.javaBasics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        numPalindrome();
        System.out.println("Enter Word to check palindrome");
        Scanner input = new Scanner(System.in);
        String enteredWord = input.nextLine();
        String reversedWord = "" ;

        for(int i= 0; i < enteredWord.length(); i++){
            reversedWord = enteredWord.charAt(i)+reversedWord;
        }

        System.out.println(reversedWord);
        if(enteredWord.equals(reversedWord)){
            System.out.println("entered word is a palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }

    static void numPalindrome(){
        int num = 121;
        int checkNum = num;
        int rev = 0;
        int rem = 0;

        while(num!=0){
            rem = num%10;
            rev = rev*10+rem;
            num= num/10;
        }
        System.out.println(rev);
        if(checkNum==rev){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }
}
