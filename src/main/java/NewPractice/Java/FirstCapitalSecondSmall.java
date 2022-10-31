package NewPractice.Java;

import java.util.PriorityQueue;

public class FirstCapitalSecondSmall {
    public static void main(String[] args) {
        if(firstCapitalSecondSmall("AbCdef")){
            System.out.println("As expected");
        }else{
            System.out.println("Entered text is not valid");
        }
        sam("Nani@udAyK123nayEr");
    }

    public static boolean firstCapitalSecondSmall(String str){
        for (int i = 0; i < str.length(); i++) {
            if(i%2 == 0){
                if(!Character.isUpperCase(str.charAt(i))){
                    return false;
                }
            } else{
                if(!Character.isLowerCase(str.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }

    static void sam(String str){
        PriorityQueue<Character> pq = new PriorityQueue<>();
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))){
                pq.add(str.charAt(i));
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))){
                s= s+ pq.poll();
            }else{
                s= s+str.charAt(i);
            }
        }
        System.out.println(s);
    }
}
