package gokul.June.jun19;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {
        String a = "Aaaaaallllltttttimetrik is Awesome";

        Character value = a.chars()
                .mapToObj(a1 -> (char) a1)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(a2 -> a2.getValue() == 1)
                .findFirst()
                .get()
                .getKey();

        System.out.println(value);

    }
}
