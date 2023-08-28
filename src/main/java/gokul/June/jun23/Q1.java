package gokul.June.jun23;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
//        Write a function that checks if two lists of integers contain the same elements.  Return true if they do, false if not.
//                Example input/output
//        Input: l1 = (1, 3, 55, 2) l2 = (1, 3, 2) Output: false
//        Input l1 = (70, 2, 12) 12 = (2, 12, 70) Output: true

        List<Integer> l1 = Arrays.asList(1, 3, 2);
        List<Integer> l2 = Arrays.asList(1, 3, 2);

        System.out.println(compareList(l1, l2));

    }

    static boolean compareList(List<Integer> list1, List<Integer> list2) {
        if (list1.size() != list2.size())
            return false;

        HashMap<Integer, Integer> occurancesMap = new HashMap<>();
        //occurancesMap reduce
        for (int a : list1)
            occurancesMap.put(a, occurancesMap.getOrDefault(a, 0) + 1);

        for (int b : list2) {
            if (occurancesMap.containsKey(b) && occurancesMap.get(b) != 0) {
                occurancesMap.put(b, occurancesMap.get(b) - 1);
            } else
                return false;
        }

        return true;
    }

//    static boolean check1(List<Integer> l1, List<Integer> l2){
//        if (l1.size() != l2.size())
//            return false;
//
//
//    }

}
