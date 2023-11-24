package main;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] productBefore = new int[length];
        int[] productAfter = new int[length];
        productBefore[0] = 1;
        productAfter[length - 1] = 1;

        for (int i = 1; i < length; i++) {
            productBefore[i] = productBefore[i - 1] * nums[i - 1];
        }

        for (int i = length - 2; i >= 0; i--) {
            productAfter[i] = productAfter[i + 1] * nums[i + 1];
        }

        int[] solution = new int[length];
        for (int i = 0; i < length; i++) {
            solution[i] = productBefore[i] * productAfter[i];
        }

        return solution;
    }
}
