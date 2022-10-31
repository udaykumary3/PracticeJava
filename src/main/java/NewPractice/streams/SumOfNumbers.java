package NewPractice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,4,4,56,32,667,23,40);
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
        Integer a = sum.get();
        System.out.println(a);
    }
}
