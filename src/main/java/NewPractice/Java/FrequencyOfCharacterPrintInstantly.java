package NewPractice.Java;

import java.util.Arrays;

public class FrequencyOfCharacterPrintInstantly {
    public static void main(String[] args) {
        String find = "aaCCCNNjjioiodnonkdjddddlooocz";
//        frequencyPrint(find);
        frequencyPrintSort(find);
    }

    private static void frequencyPrint(String find) {
        for (int i = 0; i < find.length(); i++) {
            int count = 1;

            while( i+1<find.length() && find.charAt(i) == find.charAt(i+1)){
                i++;
                count++;
            }
            System.out.print(find.charAt(i)+ ""+ count+ " ");
        }
    }

    private static void frequencyPrintSort(String find) {
        char[] ch = find.toLowerCase().toCharArray();
        Arrays.sort(ch);

        for (int i = 0; i < ch.length; i++) {
            int count = 1 ;

            while( i+1 < ch.length && ch[i] == ch[i+1]){
                i++;
                count++;
            }
            System.out.print(ch[i]+ ""+count+" ");
        }
    }
}
