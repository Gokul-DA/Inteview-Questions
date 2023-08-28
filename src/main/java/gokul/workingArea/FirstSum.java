package gokul.workingArea;

import java.util.HashMap;

public class FirstSum {
    public static void main(String[] args) {
        int k = 9;
        int a[] = new int[]{1, 5, 8, 4, 7};
        printPair(k, a);
    }

    private static void printPair(int sum, int[] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int complement = sum-array[i];
            if(map.containsKey(complement)){
                System.out.println(i +" "+ map.get(complement));
                break;
            }else
                map.put(array[i],array[i]);
        }
    }

}
