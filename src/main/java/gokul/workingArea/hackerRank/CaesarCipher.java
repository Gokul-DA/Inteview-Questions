package gokul.workingArea.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.stream.Collectors;


public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);
        System.out.println(result);
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }

    static class Result {

        /*
         * Complete the 'caesarCipher' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. STRING s
         *  2. INTEGER k
         */

        public static String caesarCipher(String input, int k) {
            // Write your code here
            char[] chars = input.toCharArray();
            HashMap<Character, Character> cipherMap = new HashMap<>();
            k%=26;
            for (char a : chars) {
                if (!cipherMap.containsKey(a))
                    if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
                        char cipherValue = (char) (a + k);
                        if (a >= 97 && (cipherValue > 122))
                            cipherValue = (char) ('a' + (cipherValue - 122) - 1);
                        else if (a <= 90 && (cipherValue > 90))
                            cipherValue = (char) ('A' + (cipherValue - 90) - 1);
                        cipherMap.put(a, cipherValue);
                    } else
                        cipherMap.put(a, a);
            }
            return input.chars().mapToObj(charr -> String.valueOf(cipherMap.get((char) charr))).collect(Collectors.joining());
        }

    }
}
//1X7T4VrCs23k4vv08D6yQ3S19G4rVP188M9ahuxB6j1tMGZs1m10ey7eUj62WV2exLT4C83zl7Q80M
//1Y7U4WsDt23l4ww08E6zR3T19H4sWQ188N9bivyC6k1uNHAt1n10fz7fVk62XW2fyMU4D83am7R80N
//1Y7U4WsDt23l4ww08E6zR3T19H4sWQ188N9bivyC6k1uNH[t1n10fz7fVk62XW2fyMU4D83am7R80N
