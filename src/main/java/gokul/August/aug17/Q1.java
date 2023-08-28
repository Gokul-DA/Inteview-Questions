package gokul.August.aug17;

public class Q1 {
    public static void main(String[] args) {
        int n = 10000;
        long sum = findSum(n);
        System.out.println(Math.sqrt((sum * 6)));
    }

    static long findSum(int n) {
        if (n == 0)
            return 1L;

        return (1 / n * n) + findSum(n - 1);


    }
}
