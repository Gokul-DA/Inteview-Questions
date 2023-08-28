package gokul.workingArea;

import java.util.HashSet;

public class MatchingStrings {
    public static void main(String[] args) {
        String a = "ababcdd";
        String b = "abad";
        int matchingStringCount = 0;
        HashSet<Character> characterHashSet = new HashSet<>();

        for (Character aChar : a.toCharArray()) {
            if (!characterHashSet.contains(aChar))
                if (b.contains(aChar.toString()))
                    matchingStringCount++;
            characterHashSet.add(aChar);
        }
        System.out.println(matchingStringCount);
    }
}
