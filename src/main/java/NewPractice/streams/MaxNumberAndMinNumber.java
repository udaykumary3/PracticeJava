package NewPractice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxNumberAndMinNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22,42,45,354,345,556);
        int max = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);
        System.out.println("*************************");
        int min = numbers.stream().min(Comparator.comparing(Integer::intValue)).get();
        System.out.println(min);

        maxNumber();
    }

    public static void maxNumber(){
        List<Integer> numbers = Arrays.asList(22,42,45,354,345,556);
        int maxNumber = numbers.get(0);
        for (int num:
             numbers) {
            if (num > maxNumber){
                maxNumber = num;
            }
        }
        System.out.println("********************"+maxNumber);
    }
}
