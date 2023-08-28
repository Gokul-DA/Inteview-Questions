package gokul.June.jun21;

import java.util.Arrays;

public class Q1_New {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        System.out.println(Arrays.toString(combine(arr, arr2)));
    }

    static int[] combine(int[] arr, int[] arr2) {
        int n1 = arr.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, index = 0;

        while (i < n1 && j < n2) {
            if (arr[i] < arr2[j])
                result[index++] = arr[i++];
            else
                result[index++] = arr2[j++];
        }

        while(i<n1)
            result[index++] = arr[i++];
        while(j<n2)
            result[index++] = arr2[j++];

        return result;
    }
}
