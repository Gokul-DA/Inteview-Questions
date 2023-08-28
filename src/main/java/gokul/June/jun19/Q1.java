package gokul.June.jun19;

import java.util.*;
import java.util.stream.*;

public class Q1 {
    public static void main(String[] args) {
        String input = "cat dog cat cat dog tiger lion lion tiger";
        String[] split = input.split(" ");

        Map<String, Long> collect = Arrays.stream(split).collect(Collectors.groupingBy(a -> a, Collectors.counting()));

//        System.out.println(collect);
        for(Map.Entry<String, Long>  a : collect.entrySet())
            System.out.println(a.getKey()+":"+a.getValue());
    }
}
