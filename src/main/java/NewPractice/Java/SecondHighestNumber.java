package NewPractice.Java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] arrayNum = {4,4,4,4};
        int largest = arrayNum[0];
        int secondLargest = arrayNum[1];

        for (int i = 0; i < arrayNum.length; i++) {
            if(arrayNum[i] > largest){
                secondLargest = largest;
                largest = arrayNum[i];
            } else if ( arrayNum[i] > secondLargest && arrayNum[i]!= largest ){
                secondLargest = arrayNum[i];
            }
        }
        System.out.println("largest is : "+largest+ " second largest is : "+secondLargest);
    }

    public static int streamForSecondHighestNumber(){
        int[] arrayNum = {4,4,4,4};
        List<Integer> num = Arrays.stream(arrayNum).boxed().collect(Collectors.toList());
        int number = num.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        return number;
    }
}