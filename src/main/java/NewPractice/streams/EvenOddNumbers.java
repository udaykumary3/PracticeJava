package NewPractice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        List<Integer> even = numbers.stream().filter(e -> e%2 == 0).filter(e -> e>0).collect(Collectors.toList());
        List<Integer> odd = numbers.stream().filter(e -> e%2 != 0).collect(Collectors.toList());
        System.out.println(even+"******" + odd);
    }
}
