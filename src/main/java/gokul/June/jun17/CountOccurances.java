package gokul.June.jun17;

import java.util.HashMap;
import java.util.Map;

public class CountOccurances {
    public static void main(String[] args) {
        String input = "Programming";
        String[] split = input.split("");
        HashMap<String, Integer> map = new HashMap<>();

        for (String a : split) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + ":" + entry.getValue());

    }

}
