package gokul.August.aug3;

import java.util.HashMap;
//Incedo
public class Q2 extends Student {

    public Q2(int id) {
        super(id);
    }

    public static void main(String[] args) {
        //array sum = 5
        int[] ints = new int[]{2, 4, 3, 5, 1};
        int sum = 5;
        //{2,3},{4,1},{5};

        findSum(ints, sum);

//        Student student = new Student(1);

    }

    private static void findSum(int[] ints, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a : ints) {
            if (sum == a) {
                System.out.println(sum);
                continue;
            }
            int complement = sum - a;
            if (map.containsKey(complement)) {
                System.out.println(a + " " + map.get(complement));
            } else
                map.put(a, a);
        }
    }
}
