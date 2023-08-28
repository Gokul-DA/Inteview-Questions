package gokul.June.jul10;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
    /*Write a Java method that takes an array of integers as input and rearranges the elements such that the array alternates between peaks and valleys.
    A peak is an element that is greater than its adjacent elements, and a valley is an element that is smaller than its adjacent elements.
    The rearranged array should have the property that every even-indexed element is either a peak or a valley.*/
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(5, 3, 7, 8, 2, 4, 7, 8, 5, 6));

        rearrange(integers);
    }


    public static void rearrange(ArrayList<Integer> integers) {
        ArrayList<Integer> valley = new ArrayList<>();
        ArrayList<Integer> peak = new ArrayList<>();
        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i - 1) > integers.get(i))
                valley.add(integers.get(i));
            else
                peak.add(integers.get(i));
        }

        System.out.println("valley " + valley);
        System.out.println("peak " + peak);
    }
}
