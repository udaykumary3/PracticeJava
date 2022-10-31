package NewPractice.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22,42,45,354,345,556);
        List<Integer> ascOrder = numbers.stream().sorted().collect(Collectors.toList());
        List<Integer> descOrder = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(ascOrder);
        System.out.println("****************");
        System.out.println(descOrder);
    }
}
