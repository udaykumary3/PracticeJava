package org.pract;

import java.util.Scanner;

public class PractiseStrings {
    public static void main(String[] args) {
//        removeDuplicates();
//        palindromeString();
//        numberPalindrome();
//        fibonacci();
        countVowels();
    }

    static void removeDuplicates(){
        System.out.println("Enter String to remove duplicates");
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String removedDuplicates = "";

        for (int value = 0; value < original.length(); value++) {
            if(!removedDuplicates.contains(String.valueOf(original.charAt(value)))){
                removedDuplicates+=String.valueOf(original.charAt(value));
            }
        }
        System.out.println("Text after removing the duplicates is "+removedDuplicates);
    }

    static void palindromeString(){
        System.out.println("Enter String to check Palindrome");
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String pal = "";
        for (int i = 0; i < original.length(); i++) {
            pal = original.charAt(i)+pal;
        }
        System.out.println("value of reverse is "+ pal);
        if(pal.contains(original)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }

    static void numberPalindrome(){
        System.out.println("Enter number to check Palindrome");
        Scanner sc = new Scanner(System.in);
        int original = sc.nextInt();
        int pal = original;
        int rev = 0;
        while(original>0){
            int rem = original%10;
            rev = rev*10 + rem;
            original= original/10;
        }
        System.out.println("reverse of number is "+ rev);
        if(pal==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }

    static void fibonacci(){
        System.out.println("Enter number to print fibonacci series");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2);
        for (int i = 2; i <= count ; i++) {
            int n3 = n1 + n2;
            System.out.print(" "+n3);
            n1= n2;
            n2 = n3;
        }
    }
    static void countVowels(){
        System.out.println("Enter the text to count vowels");
        Scanner sc = new Scanner(System.in);
        String texts = sc.nextLine();
        String text = texts.toLowerCase();
        int vowelCount = 0;
        int digitsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char textValue = text.charAt(i);
            if(textValue == 'a' || textValue == 'e' || textValue == 'i' || textValue == 'o' || textValue == 'u'){
               vowelCount++;
            }else if(textValue>='a'||textValue<='z' && textValue!=' ' && !Character.isDigit(textValue)){
                consonantsCount++;
            }else if(Character.isDigit(textValue)){
                digitsCount++;
            }
        }
        System.out.println("number of vowels "+ vowelCount);
        System.out.println("number of consonants are "+consonantsCount);
        System.out.println("number of digits are "+digitsCount);
    }

}
