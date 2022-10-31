package NewPractice.Java;

import java.util.*;

public class DuplicateNumberInArray {
    public static void main(String[] args) {
        dupArray();
        dupNum();
    }

    static void dupArray(){
        List<Integer> dummyList = Arrays.asList(22,12,34,22,34,566,335,53,12);
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> dummySet = new HashSet<>();

        for (int i = 0; i < dummyList.size(); i++) {
            if(!uniqueSet.add(dummyList.get(i))){
                dummySet.add(dummyList.get(i));
            }
        }
        System.out.println(dummySet);
        System.out.println(uniqueSet);
    }

    static void dupNum(){
        List<Integer> dummyList = Arrays.asList(22,12,34,22,34,566,335,53,12);
        Set<Integer> s= new HashSet<>();

        for(Integer i : dummyList){
            if (!s.add(i)) {
                System.out.println("duplicate numbers are :"+i);
            }
        }
    }
}
