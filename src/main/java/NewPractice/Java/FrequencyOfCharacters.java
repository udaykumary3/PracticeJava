package NewPractice.Java;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String name = "xyz";
        frequencyOfCharactersUsingHashMap(name);
//        frequencyOfCharactersUsingList(name);
    }
    public static void frequencyOfCharactersUsingHashMap(String checkName){
        checkName = checkName.replace(" ","").toLowerCase();
        System.out.println(checkName);
        char[] charArray = checkName.toCharArray();
        Map<Character,Integer> charMap = new HashMap<>();

        for (char ch: charArray) {
            if (charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+1);
            }else{
                charMap.put(ch,1);
            }
        }
        System.out.println(charMap);

        for(Map.Entry<Character,Integer> map : charMap.entrySet()){
            char key = map.getKey();
            int value = map.getValue();
            if(value>=1){
                System.out.print(key+" ");
            }
        }
        System.out.println();
    }

    public static void frequencyOfCharactersUsingList(String name) {
        name = name.replace(" ","").toLowerCase();
        char[] ch = name.toCharArray();
        int count;

        for (int i = 0; i < ch.length; i++) {
            count = 1;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i] == ch[j]){
                    count++;
                    ch[j] = '0';
                }
            }
            if(count > 1 && ch[i] != '0'){
                System.out.print(ch[i]+" ");
            }
        }
    }
}
