package gokul.June.jun27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("a", "b", "c", "a", "b", "e");
        List<String> list2 = Arrays.asList("a", "b", "c", "a", "d");

        System.out.println(commonElement(list1, list2));
    }

    static List<String> commonElement(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();

        HashSet<String> list1Set = new HashSet<>(list1);
        HashSet<String> list2Set = new HashSet<>(list2);

        for (String a : list1Set) {
            if (list2Set.contains(a))
                result.add(a);
        }

//        list1.forEach(a -> {
//            list2.forEach(b -> {
//                if (a.equals(b) && !result.contains(a)) {
//                    result.add(a);
//                }
//            });
//        });
        return result;
    }
}
