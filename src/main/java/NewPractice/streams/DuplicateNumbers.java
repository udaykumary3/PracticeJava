package NewPractice.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,1,5,3,5,2);
        Set dupicate = numbers.stream().filter(e -> Collections.frequency(numbers,e)>1).collect(Collectors.toSet());
        System.out.println(dupicate);
    }
}
