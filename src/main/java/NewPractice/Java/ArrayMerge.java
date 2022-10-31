package NewPractice.Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class  ArrayMerge {
    public static void main(String[] args){
        arrayMerge();
    }
    
    public static void arrayMerge(){
        int[] singleNum = {0,1,2,3,5,4,6,7,8};
        int[] doubleNum = {11,22,33,44,55,66,77,88,99};
        int count = 0;
        int length = singleNum.length + doubleNum.length;
        Integer[] mergedNum = new Integer[length];

        for (int i = 0; i< singleNum.length; i++){
            mergedNum[i] = singleNum[i];
            count++;
        }

        for (int j = 0; j < doubleNum.length; j++) {
            mergedNum[count] = doubleNum[j];
            count++;
        }
        Arrays.sort(mergedNum , Collections.reverseOrder());
        Arrays.stream(mergedNum).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(Arrays.toString(mergedNum));

    }
}
