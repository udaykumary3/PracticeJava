package NewPractice.Java;

import java.util.Arrays;

public class ReverseStringWithoutChangingPositions {
    public static void main(String[] args) {
        reverseString("Rasna is a good girl");
    }

    private static void reverseString(String word) {
        String[] wordArray = word.split("\\s");
        String newSentence = "";
        System.out.println(Arrays.toString(wordArray));
        for(int i=0;i< wordArray.length;i++){
            String reversedWord = "";
            System.out.println(wordArray[i]);
            String singleWord = wordArray[i];
            for (int j = 0; j < singleWord.length(); j++) {
                reversedWord = singleWord.charAt(j)+reversedWord;
            }
            newSentence = newSentence + reversedWord + " ";
        }
        System.out.println(newSentence.trim());
    }
}
