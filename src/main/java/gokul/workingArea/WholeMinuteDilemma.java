package gokul.workingArea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WholeMinuteDilemma {

    public static int countPairs(List<Integer> time) {
        int count = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int t : time) {
            int remainder = t % 60;
            int complement = (60 - remainder) % 60;

            if (frequencyMap.containsKey(complement)) {
                count += frequencyMap.get(complement);
            }

            frequencyMap.put(remainder, frequencyMap.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> time = new ArrayList<>();
        time.add(30);
        time.add(20);
        time.add(150);
        time.add(100);
        time.add(40);
        time.add(60);
        time.add(120);
        time.add(90);

        int result = countPairs(time);
        System.out.println("Number of pairs: " + result);
    }
}
