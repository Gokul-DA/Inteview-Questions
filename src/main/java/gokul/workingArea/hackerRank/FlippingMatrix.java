package gokul.workingArea.hackerRank;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class FlippingMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> matrix = new ArrayList<>();

                IntStream.range(0, 2 * n).forEach(i -> {
                    try {
                        matrix.add(
                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                        .map(Integer::parseInt)
                                        .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int result = Result.flippingMatrix(matrix);
                System.out.println(result);
//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
//        bufferedWriter.close();
    }

    static class Result {

        /*
         * Complete the 'flippingMatrix' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
         */

        public static int flippingMatrix(List<List<Integer>> matrix) {
            // Write your code here
            int n = matrix.size() / 2;
            for (List<Integer> integers : matrix)
                Collections.sort(integers, Comparator.reverseOrder());
            String result;
            for (List<Integer> integers : matrix) {
                result = integers.stream().map(String::valueOf).collect(joining(" "));
                System.out.println(result);
            }
            return 0;
        }

    }
}

