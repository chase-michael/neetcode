package main;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] targetElements = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int neededValue = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == neededValue) {
                    targetElements[0] = i;
                    targetElements[1] = j;
                    return targetElements;
                }
            }
        }
        return null;
    }
}
