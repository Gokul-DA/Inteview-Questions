package gokul.June.jun20;

import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) {
        // There is a large pile of socks that must be paired by color.
        // Given an array of integers representing the color of each sock,
        // determine how many pairs of socks with matching colors there are.
        // Example
        // n = 7
        // array = [1,2,1,2,1,3,2]
        // There is one pair of color 1 and one of color 2.
        // There are three odd socks left, one of each color.
        // The number of pairs is 2.

//        int[] array = {1,2,1,2,1,3,2};
//        int[] array = {1, 1, 1, 2, 2, 1, 1};
        int[] array = {1, 1, 1, 2, 2, 1, 1, 3, 1, 3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : array)
            map.put(i,map.getOrDefault(i,0)+1);

        int pair = 0;
        for (Integer value : map.values())
            pair += value/2;

        System.out.println(pair);
    }
}
