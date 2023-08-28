package gokul.August.aug3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q1 {
//    FSS
    public static void main(String[] args) {
        String nameAndSkill= "GokulSJavaCamunda";
        Map<String, Long> collect = Arrays.stream(nameAndSkill.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        HashMap<String,Integer> hashMap =new HashMap<>();
        for(String a : nameAndSkill.split(""))
            hashMap.put(a, hashMap.getOrDefault(a,0)+1);
        for(Map.Entry<String,Integer> entry : hashMap.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());
    }
}
