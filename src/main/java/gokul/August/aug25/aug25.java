package gokul.August.aug25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class aug25 {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 56, 7, 89, 10);
        Comparator<Integer> comparator = (a,b) -> b-a;
        Optional<Integer> max = listOfIntegers.stream().max(Integer::compareTo);
        Optional<Integer> min = listOfIntegers.stream().min(Integer::compareTo);
        System.out.println(max);
        System.out.println(min);
    }
}
