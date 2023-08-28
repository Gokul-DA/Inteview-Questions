package gokul.August.aug24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
//        List<Integer> values = new ArrayList<>(Arrays.asList(1,5,2,4,3,6,7,8));
//        System.out.println(values);
//        Collections.sort(values);
//        System.out.println(values);

        List<String> string1 = new ArrayList<>(Arrays.asList("AB","BC","DE"));
        List<String> string2 = new ArrayList<>(Arrays.asList("AB","GT","DE"));

        for(String value : string1){
            if(string2.contains(value))
                System.out.println(value);
        }
    }
}
