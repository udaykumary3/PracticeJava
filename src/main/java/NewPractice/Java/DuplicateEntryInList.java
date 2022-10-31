package NewPractice.Java;

import java.util.*;

public class DuplicateEntryInList {
    public static void main(String[] args) {
        List<String> colorList = Arrays.asList("yellow", "red", "blue", "green", "yellow", "red");
//        duplicateEntryInListUsingMap(colorList);
//        duplicateEntryUsingSet(colorList);
        duplicateEntryInListUsingList(colorList);
    }

    private static void duplicateEntryInListUsingList(List<String> colorList) {
        int count;

        for (int i = 0; i < colorList.size(); i++) {
            count = 1;
            for (int j = 1; j < colorList.size(); j++) {
                if (colorList.get(i).equals(colorList.get(j))) {
                    count++;
                    colorList.set(j, "0");
                }
            }
            if (count > 1 && colorList.get(i) != "0") {
                System.out.print(colorList.get(i) + " ");
                if (colorList.get(i).isEmpty()) {
                    System.out.println("no duplicates");
                }
            }
        }
    }

    private static void duplicateEntryInListUsingMap(List<String> strings) {
        Map<String, Integer> colorsMap = new HashMap<>();

        for (String color : strings) {
            if (colorsMap.containsKey(color)) {
                colorsMap.put(color, colorsMap.get(color) + 1);
            } else {
                colorsMap.put(color, 1);
            }
        }
        System.out.println(colorsMap);

        //printing data in hashmap
//        colorsMap.entrySet().forEach(entry -> System.out.println(entry.getKey()+ " "+ entry.getValue()));

        //iterating in map and finding the required key which has expected value
        for (Map.Entry<String, Integer> name : colorsMap.entrySet()) {
            String key = name.getKey();
            Integer value = name.getValue();

            if (value > 1) {
                System.out.println("duplicate entries in list " + key);
            }
        }
    }

    private static void duplicateEntryUsingSet(List<String> strings) {
        Set<String> setString = new HashSet<>();
        for (String color : strings) {
            if (!setString.add(color)) {
                System.out.println(color + " is the duplicate value");
            }
        }
    }
}
