package gokul.workingArea.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;



public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result1.plusMinus(arr);

        bufferedReader.close();
    }
    static class Result1 {

        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void plusMinus(List<Integer> arr) {
            // Write your code here
            int positive =0,negative=0,zero=0;
            int size = arr.size();
            for(Integer a : arr){
                if(a==0)
                    zero++;
                else if(a>0)
                    positive++;
                else if(a<0)
                    negative++;

            }
            DecimalFormat df =new DecimalFormat("#.######");
            System.out.println(df.format((float)positive/size));
            System.out.println(df.format((float)negative/size));
            System.out.println(df.format((float)zero/size));
//        System.out.println((Math.round((double) positive/size)* Math.pow(10,6))/Math.pow(10,6));
//        System.out.println((Math.round((float) negative /size)* Math.pow(10,6))/Math.pow(10,6));
//        System.out.println((Math.round((float) zero /size)* Math.pow(10,6))/Math.pow(10,6));

        }

    }
}
