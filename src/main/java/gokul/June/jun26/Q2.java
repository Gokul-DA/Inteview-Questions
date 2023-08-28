package gokul.June.jun26;

import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        /*//print first pair whose sum is K e.g K=9
        ;*/
        int k = 9;
        int a[] = new int[]{1, 5, 8, 4, 7};
        printPair(k, a);
    }

    static <HashSet> void printPair(int k, int[] input) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int complement = k - input[i];
            if (map.containsKey(complement)) {
                System.out.println(map.get(complement)+" "+i);
                break;
            }
            map.put(input[i], i);
        }
    }
}
