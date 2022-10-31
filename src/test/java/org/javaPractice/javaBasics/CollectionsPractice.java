package org.javaPractice.javaBasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsPractice {
    public static void arrayList(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1,6);
        arr.set(0, 3);
        arr.add(1);
        arr.add(2);
//        arr.clear();
        System.out.println(arr.isEmpty());
//        arr.removeIf(s -> s < 2);
        System.out.println(arr.indexOf(2));
        System.out.println("size of array :"+arr.size());
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        arrayList();
        sets();
    }

    public static void sets(){
        HashSet<Integer> se = new HashSet<>();
        se.add(3);
        se.add(2);
        se.add(6);
        se.add(9);
        se.add(3);
        se.add(11);

//        se.remove(3);
        System.out.println(se);

        Iterator<Integer> it = se.iterator();
        System.out.println(it.hasNext());
//        System.out.println(it.next());
        System.out.println();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
