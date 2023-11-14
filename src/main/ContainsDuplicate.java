package main;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        boolean current = true;

        for (int i = 0; i < array.length; i++) {
            current = set.add(array[i]);
            if (!current) {
                return true;
            }
        }
        return false;
    }
}
