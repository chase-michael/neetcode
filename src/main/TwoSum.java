package main;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int neededValue = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == neededValue) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
