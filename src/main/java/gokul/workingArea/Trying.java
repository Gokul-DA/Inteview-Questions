package gokul.workingArea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trying {
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

        int result = count(time);
        System.out.println("Number of pairs: " + result);
    }

    static int count(List<Integer> list) {

        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        //a 100, rem 20, com 40
        for (int a : list) {
            int reminder = a % 60;
            int complement = (60 - a) % 60;

            if(map.containsKey(complement))
                count++;

            map.put(reminder,map.getOrDefault(reminder,0)+1);

        }

        return count;
    }
}
