package gokul.workingArea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddEven {
    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(6,4,2,8,1,3,5));
//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(5,1,3,7,9,15));
        int start = 0, end = a.size() - 1;

        while (start < end) {
            int temp;
            if (a.get(start) % 2 == 0 && a.get(end) % 2 == 1) {
                temp = a.get(start);
                a.set(start, a.get(end));
                a.set(end, temp);
                sort(a,start,end);
                end--;
                start++;
                continue;
            }
            if (a.get(start) % 2 == 1)
                start++;
            if (a.get(end) % 2 == 0)
                end--;
        }


        System.out.println(a);
    }

    private static void sort(ArrayList<Integer> a, int start, int end) {

    }

}
