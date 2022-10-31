package org.javaPractice.javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args) {
        String[] stringArray = {"uday", "yakala", "nani", "Uma", "Apple"};
        List<String> names = new ArrayList<>();
        names.add("abhi");
        names.add("uday");
        names.add("alex");
        names.add("alien");
        names.add("nani");
        int count = 0;
        long streamCount;
        for(String name:names){
            if(name.startsWith("a")){
                count+=1;
            }
        }
        System.out.println(count);

        //streams for array list
        streamCount = names.stream().filter(s -> s.startsWith("a")).count();
        System.out.println(streamCount);

        //streams for array
        List<String> afterStream = Arrays.stream(stringArray).filter(s -> s.startsWith("u") || s.startsWith("U")).collect(Collectors.toList());
        System.out.println(afterStream);
    }
}
