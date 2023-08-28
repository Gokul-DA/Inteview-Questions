package gokul.June.jun17;

import java.util.HashSet;

public class DuplicateWords {
    public static void main(String[] args) {
        /*[12:03 pm] Saravanan Ramesh
    Input : "Java is a programming language. Python is also a programming language."
    Output : Duplicate words are : "is","a","programming","language."
    */
        String input = "Java is a programming language. Python is also a programming language.";
        String[] split = input.split(" ");

        HashSet<String> set = new HashSet<>();

        for (String a : split) {
            if (!set.add(a))
                System.out.println(a);
        }
    }
}
