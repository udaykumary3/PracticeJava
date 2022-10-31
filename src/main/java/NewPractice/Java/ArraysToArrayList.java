package NewPractice.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysToArrayList {
    public static void main(String[] args) {
        String[] stringArray = {"uday", "kumar", "Yakala"};
        List<String> arrayList = Arrays.asList(stringArray);
        System.out.println(arrayList);

        int[] intArray = {2,3,42,423,245,23,32};
        List<Integer> intArrays = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        System.out.println(intArrays);
    }
}
