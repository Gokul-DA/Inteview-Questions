package gokul.workingArea;

import java.util.HashSet;

public class LongestSubString {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwpekw"));
//        System.out.println(lengthOfLongestSubstring("aab"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 )
            return 0;
        HashSet<String> set = new HashSet<>();
        String[] split = s.split("");
        int count = 0, previousHigh = 0;
        for (String a : split) {
            if (!set.add(a)) {
                if (count > previousHigh)
                    previousHigh = count;
                set = new HashSet<>();
                count = 0;
            }
                count++;
        }
        return Math.max(previousHigh, count);
    }
    public static int lengthOfLongestSubstring1(String s) {
        int maxLength = 0;

        for(int right = 0 ,left =0 ;right<s.length();right++){
            int indexAlreadyPresent = s.substring(left,right).indexOf(s.charAt(right));
            if(indexAlreadyPresent >=left && indexAlreadyPresent <right )
                left = indexAlreadyPresent+1;

            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}