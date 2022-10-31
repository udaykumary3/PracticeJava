package org.javaPractice.javaBasics;


import java.util.*;

public class MapTable {
    public static void main(String[] args) {
        maps();
        table();
    }
    public static void maps(){
        Map<Integer,String> hm = new HashMap<>();
        hm.put(1, "uday");
        hm.put(2, "kumar");
        hm.put(3,"yakala");
        hm.put(null, "nani");

        Iterator it = hm.keySet().iterator();
        while(it.hasNext()){
            Object key = it.next();
            System.out.println("s.no : " + key
                    + "\t\t Name : "
                    + hm.get(key));
        }
    }

    public static void table(){
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "uday");
        ht.put(2, "kumar");
        ht.put(3,"yakala");
        ht.put(4, "nani");

        System.out.println();
        Enumeration<Integer> e = ht.keys();
        while(e.hasMoreElements()){
            Object key = e.nextElement();
            System.out.println("s.no : " + key
                    + "\t\t Name : "
                    + ht.get(key));
        }

        System.out.println();
        Iterator it = ht.keySet().iterator();
        while(it.hasNext()){
            Object key = it.next();
            System.out.println("s.no : " + key
                    + "\t\t Name : "
                    + ht.get(key));
        }
    }
}
