package org.javaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(0,"morning");
        hm.put(1,"AfterNoon");
        hm.put(2,"evening");
        hm.put(3,"night");

//        System.out.println(hm);
        Set ss = hm.entrySet();
        Iterator st = ss.iterator();

        while(st.hasNext()){
//            System.out.println(st.next() );
            Map.Entry mp = (Map.Entry)st.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }

    }
}
