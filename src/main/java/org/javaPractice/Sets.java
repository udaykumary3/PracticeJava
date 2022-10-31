package org.javaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Sets {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("morning");
        hs.add("dawn");
        hs.add("afternoon");
        hs.add("evening");
        hs.add("night");

        Iterator<String> itr =hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("**************");
        for(String s: hs){
            System.out.println(s);
        }

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(9);
        al.add(2);
        al.add(8);
        al.add(3);
        al.add(7);

        for(int i=0;i<al.size();i++){
            System.out.println("values in list are "+ al.get(i));
        }
    }
}
