package gokul.workingArea.hackerRank;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;


public class TowerBreaker {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int result = Result.towerBreakers(n, m);
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
         * Complete the 'towerBreakers' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER m
         */

        public static int towerBreakers(int noOfTowers, int height) {
            // Write your code here
//            HashMap<Integer, Integer> map = new HashMap<>();
//            for (int i = 0; i < noOfTowers; i++) {
//                map.put(i, height);
//            }
//
//            int playerIndex = 0;
//            while (true) {
//                Collection<Integer> values =  map.values();
//                if(values.stream().allMatch(num-> num==1)){
//                    break;
//                }
//
//                Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
//
//                while(iterator.hasNext()){
//                    Map.Entry<Integer, Integer> entry = iterator.next();
//                    if (entry.getValue()!=1) {
//                        entry.setValue(1);
//                        break;
//                    }else
//                        iterator.remove();
//                }
////                for(Map.Entry<Integer,Integer> entry : map.entrySet()){
////                    if (entry.getValue()!=1) {
////                        entry.setValue(1);
////                        break;
////                    }else
////                        map.remove(entry.getKey());
////                }
//                playerIndex++;
//            }
//
//            return playerIndex % 2 == 1 ? 1 : 2;
            if (noOfTowers % 2 == 0 || height == 1) {
                return  2; // Player 2 wins
            } else {
                return  1; // Player 1 wins
            }

        }


    }
}
