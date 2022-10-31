package NewPractice.Java;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {

        LinkedList<String> li = new LinkedList<>();
        li.add("uday");
        li.add("kumar");
        li.add("yakala");

        ArrayList<String> ai = new ArrayList<>();
        ai.add("uday");
        ai.add("kumar");
        ai.add("yakala");

        System.out.println(li.get(1));

        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }

    }
}
