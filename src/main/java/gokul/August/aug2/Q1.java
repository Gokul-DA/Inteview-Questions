package gokul.August.aug2;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        //rotate the element in the array
        int[] a = {1,2,3,4,5};
        int r = 8;

        System.out.println(rotateArray(r,a));
    }

    private static ArrayList<Integer> rotateArray(int r, int[] a) {
        int actualR = r%a.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i: a)
            arrayList.add(i);
        for (int i = 0; i < actualR; i++) {
            int lastIndex =a.length-1;
            int lastElement = arrayList.remove(lastIndex);
            arrayList.add(0,lastElement);
        }
        return arrayList;
    }
}
