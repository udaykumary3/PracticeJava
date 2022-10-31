package org.javaPractice;

public class StringSplit {
    public static void main(String[] args) {
//        String text = "";
//        String[] str = text.replace("Z", "Z#").split("#");
//        String str[]=text.split("Z");
//        System.out.println(str[0]);
//         for(String i:str){
//             System.out.println(i);
//         }
         StringSplit sp = new StringSplit();
         sp.stg();
    }

    void stg(){
        String stw = "Uday needs to learn java";
        String rev = "";
        char ch;
        for(int i=0;i<stw.length();i++){
            ch = stw.charAt(i);
            rev= ch+rev;
        }
        System.out.println(rev);
        String reve=rev.concat(" reverse");
        System.out.println(reve);
    }

}
