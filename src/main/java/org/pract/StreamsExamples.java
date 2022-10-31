package org.pract;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExamples {
    public static void main(String[] args) {
//        firstChar();
//        streams();
        uniqueNum();
    }

    static void firstChar() {
        int count = 0;
        String[] a = {"uday", "alphabet", "aeroplane", "kumar", "yakala", "apple"};
        for (String first : a) {
            first.charAt(0);
            if (first.charAt(0) == 'A' || first.charAt(0) == 'a') {
                System.out.println(first);
                count++;
            }
        }
        System.out.println("number of words starting with A are " + count);
    }

    static void streams() {
        String[] a = {"uday", "alphabet", "aeroplane", "kumar", "yakala", "apple"};
//        List li =Arrays.asList(a);
        long c = Arrays.stream(a).filter(s -> s.startsWith("a")).count();
        Arrays.stream(a).filter(s -> s.startsWith("a")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
        System.out.println("number of words starting with A are " + c);
    }

    static void uniqueNum() {
        int[] num = {1, 2, 2, 1, 2, 3, 33, 33, 2, 9, 7, 5, 4, 3, 4, 55, 66, 6, 66};
        String[] names = {"uday", "uday", "kumar", "yakala", "apple", "apple"};
        Arrays.stream(num).distinct().sorted().forEach(System.out::println);
        Arrays.stream(names).distinct().sorted().forEach(System.out::println);

        //converting int type to list
        List<Integer> numbers = Arrays.stream(num).distinct().sorted().boxed().collect(Collectors.toList());
        List<String> namesList = Arrays.stream(names).distinct().sorted().collect(Collectors.toList());
    }
}
