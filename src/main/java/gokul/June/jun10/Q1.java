package gokul.June.jun10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q1 {
    public static void main(String[] args) {
        convertBinary(5);
    }
    static void convertBinary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        System.out.println(binary);
    }
    public static void convert(int input) {
        int quotient = input;
        ArrayList<Integer> arrayList = new ArrayList<>();
        do {
            arrayList.add(quotient % 2);
            quotient = quotient / 2;
        } while (quotient != 1);
        arrayList.add(quotient);
        Collections.reverse(arrayList );
        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList);
    }



}
