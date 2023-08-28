package gokul.workingArea;

import java.util.Arrays;
import java.util.Comparator;

public class Example {
    public static void main(String[] args) {
//        System.out.println(reverseFunction(new char[]{'2', '5', '4', '3','4'}));
        System.out.println(Arrays.toString(order(new int[]{2, 1, 3, 5, 6, 5, 2, 3})));
//        Integer[] ints = {1, 2, 3, 4, 5};
//        Arrays.sort(ints, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(ints));
    }

    //move odd to left and even to right
    static int[] order(int[] input){
        int[] result = new int[input.length];
        return result;
    }
    public static char[] reverseFunction(char[] input) {
        int i = 0, j = input.length - 1;
        while (i < j) {
            char temp = input[i];
            input[i] = input[j];
            input[j] = temp;
            i++;
            j--;
        }
        return input;
    }
}
