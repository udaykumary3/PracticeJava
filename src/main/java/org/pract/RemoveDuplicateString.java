package org.pract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateString {

    public static void main(String[] args) {
        String original = "uday Kumar";
        char[]ch = original.toCharArray();
        ArrayList<Character> charArray = new ArrayList<Character>();
        for (int i = 0; i <ch.length ; i++) {
            charArray.add(ch[i]);
        }
        List<Character> afterChangeList = charArray.stream().distinct().collect(Collectors.toList());
//        System.out.println(afterChangeList);

        String result = "";
        for (int i = 0; i < original.length(); i++) {
            if(!result.contains(String.valueOf(original.charAt(i)))) {
                result += String.valueOf(original.charAt(i));
            }
        }
        System.out.println(result);

    }
}
