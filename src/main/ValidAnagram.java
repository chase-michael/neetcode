package main;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] sArray = new int[26];
        int[] tArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 97] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            tArray[t.charAt(i) - 97] += 1;
        }

        return Arrays.compare(sArray, tArray) == 0;
    }
}
