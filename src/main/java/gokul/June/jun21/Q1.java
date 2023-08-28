package gokul.June.jun21;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10, 12};

        System.out.println(Arrays.toString(combine(arr, arr2)));
    }

    static int[] combine(int[] arr, int[] arr2) {

        int[] result = new int[arr.length + arr2.length];
        int index = 0;
        int i = 0, j = 0;

        if (arr.length == 0)
            return arr2;
        if (arr2.length == 0)
            return arr;

        while (index < (arr.length + arr2.length)) {
            if (arr[i] < arr2[j]) {
                result[index] = arr[i];
                if (i < arr.length - 1)
                    i++;
                else {
                    while (j < arr2.length)
                        result[++index] = arr2[j++];
                    break;
                }
            } else {
                result[index] = arr2[j];
                if (j < arr2.length - 1)
                    j++;
                else {
                    while (i < arr.length)
                        result[++index] = arr[i++];

                    break;
                }
            }
            index++;
        }

        return result;
    }
}
