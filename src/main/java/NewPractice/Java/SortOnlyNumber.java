package NewPractice.Java;

import java.util.PriorityQueue;

public class SortOnlyNumber {
    public static void main(String[] args) {
        sortNumber("Test@2194363 Google");
        //output : Test@1233469 Google
    }

    static void sortNumber(String str){
        String afterSort = "";
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                pq.add(Integer.parseInt(String.valueOf(ch)));
            }
        }

        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                afterSort = afterSort + pq.poll();
            } else{
                afterSort = afterSort+ch;
            }
        }
        System.out.println(afterSort);
    }
}
