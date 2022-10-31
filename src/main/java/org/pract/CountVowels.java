package org.pract;

public class CountVowels {
    public static void main(String[] args) {
        String vowelsArray = "uday Kumar 123";
        int number = vowelsCount(vowelsArray);
        System.out.println("vowels count in given words are "+number);
    }
    static int vowelsCount(String checkVowels){
        int vowelCount = 0;
        int consonants= 0;
        int digitsCount = 0;
        String valueCheck = checkVowels.toLowerCase();
        for (int i = 0; i < valueCheck.length(); i++) {
            char ch = valueCheck.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }else if (ch != ' ' && !Character.isDigit(ch)){
                consonants++;
            } else if(Character.isDigit(ch)){
                digitsCount++;
            }
        }
        System.out.println("consonants count in given words are "+consonants);
        System.out.println("digits count in given word are "+digitsCount);
        return vowelCount;

    }
}
