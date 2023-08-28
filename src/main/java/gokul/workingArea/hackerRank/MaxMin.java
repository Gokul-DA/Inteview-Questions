package gokul.workingArea.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;



public class MaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }

    private static class Result {

        public static void miniMaxSum(List<Integer> arr) {
            Collections.sort(arr);
            int max = 0,min=0;
            for (int i = 0; i < arr.size(); i++) {
                if(i<4)
                    min+=arr.get(i);
                if(i>0)
                    max+=arr.get(i);
            }
            System.out.println(min+ " "+max);
        }

    }
}
