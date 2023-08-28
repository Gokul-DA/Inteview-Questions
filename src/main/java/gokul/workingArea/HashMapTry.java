package gokul.workingArea;

import java.util.*;

public class HashMapTry {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 30);
        map.put("Alice", 25);
        map.put("Bob", 35);
        map.put("David", 20);

        System.out.println("Original HashMap: " + map);
//
//        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
//        list.sort(Map.Entry.comparingByValue());
//
//        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
//        for (Map.Entry<String, Integer> entry : list) {
//            sortedMap.put(entry.getKey(), entry.getValue());
//        }

        Map.Entry.comparingByValue();

    }
}
