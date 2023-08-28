package gokul.workingArea.hackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


/*

9
6 6 7 -10 9 -3 8 9 -1
9 7 -10 6 4 1 6 1 1
-1 -2 4 -6 1 -4 -6 3 9
-8 7 6 -1 -6 -6 6 -7 2
-10 -4 9 1 -7 8 -5 3 -5
-8 -3 -4 2 -3 7 -5 1 -5
-2 -7 -4 8 3 -1 8 2 3
-3 4 6 -7 -7 -8 -3 9 -6
-2 0 5 4 4 4 -3 3 0

*/
public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/resources/DiagonalDifference.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }

    static class Result {

        /*
         * Complete the 'diagonalDifference' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY arr as parameter.
         */

        public static int diagonalDifference(List<List<Integer>> arr) {
            // Write your code here
            int size = arr.size(), leftIndex = 0, rightIndex = arr.size() - 1;
            int rightSum = 0, leftSum = 0;
            for (List<Integer> list : arr) {
                rightSum += list.get(rightIndex);
                leftSum += list.get(leftIndex);
                rightIndex--;
                leftIndex++;
            }
            return (leftSum - rightSum) * -1;
        }

    }
}
