package NewPractice.Java;

import org.testng.annotations.Test;

public class UpperCaseCount {
    @Test
    public void upperCaseCount(){
        String name = "autMaTiON";
        char[] ch = name.toCharArray();
        String output = "";

        for (int i = 0; i < ch.length; i++) {
            if(Character.isUpperCase(ch[i])){
                output = output+ch[i];
            }
        }
        System.out.println(output);
    }
}
