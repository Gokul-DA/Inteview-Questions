package gokul.June.jun26;

import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        /*[06:02 pm] UD (Guest)
        // sum of the squares of odd numbers from list
        static int getSum(){​​
        int sum;
        //write code here
        return sum;
        }​​
        */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.stream().filter(a -> a % 2 == 1)
                .mapToInt(value -> value * value).sum());

        newWays(list);
    }


    static void newWays(List<Integer> numbers) {
        int sumOfSquaresOfOdds = numbers.stream()
                .filter(n -> n % 2 != 0)    // Filter odd numbers
                .map(n -> n * n)            // Square each number
                .collect(() -> new int[1], (arr, num) -> arr[0] += num, (arr1, arr2) -> arr1[0] += arr2[0])[0]; // Calculate the sum using collect with a custom accumulator

        System.out.println("Sum of squares of odd numbers: " + sumOfSquaresOfOdds);

    }
}
