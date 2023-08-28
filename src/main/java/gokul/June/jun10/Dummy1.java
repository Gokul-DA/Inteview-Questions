package gokul.June.jun10;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dummy1 {
    public static void main(String[] args) {
        int a = 2 ;

        int incre = 3;
        for (int i = 0; i < 10 ; i++) {
            a+= incre;
            System.out.println(a);
            incre = incre+2;
        }

//        Stream<Integer> a ;
//        a.findAny();

    }
}
