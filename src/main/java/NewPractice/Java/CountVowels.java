package NewPractice.Java;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println("Enter desired word to check count of vowels : ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        vowels("udayKumar is a good boy");
    }

    private static void vowels(String word){
        int len = word.length();
        String smallWord = word.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        int digitsCount = 0;
        int scrapValue = 0;

        for (int i = 0; i < len; i++) {
            if(smallWord.charAt(i)=='a' || smallWord.charAt(i) == 'e' || smallWord.charAt(i) == 'i'  || smallWord.charAt(i) == 'o'  || smallWord.charAt(i) == 'u' ){
                vowelCount++;
            } else if (smallWord.charAt(i)!= ' ' && !Character.isDigit(smallWord.charAt(i))) {
                consonantCount++;
            } else if (Character.isDigit(smallWord.charAt(i))) {
                digitsCount++;
            } else{
                scrapValue++;
            }
        }

        System.out.println( "vowel count is "+ vowelCount+ " consonant count is "+ consonantCount +" digits count is "+digitsCount
        +" some other scrap value if any "+scrapValue);

    }
}

