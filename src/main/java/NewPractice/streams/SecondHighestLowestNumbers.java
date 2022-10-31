package NewPractice.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestLowestNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22, 42, 45, 354, 345, 556);
        int num = numbers.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(num);
    }
}
