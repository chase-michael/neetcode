package tests;

import main.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    public void shouldReturnFirstMatchingPair() {
        int[] array = {3, 3, 3};
        int target = 6;
        int[] expected = new int[] {0, 1};
        int[] actual = TwoSum.twoSum(array, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldBeStable() {
        int[] array = {0, 0, 0, 0, 0, 1};
        int target = 1;
        int[] expected = new int[] {0, 5};
        int[] actual = TwoSum.twoSum(array, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldWorkAtEndOfArray() {
        int[] array = {-5, -12, -99, 44, 810801, 1};
        int target = 810802;
        int[] expected = new int[] {4, 5};
        int[] actual = TwoSum.twoSum(array, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindPairInMixedArray() {
        int[] array = {8, 3, 3, 4};
        int target = 6;
        int[] expected = new int[] {1, 2};
        int[] actual = TwoSum.twoSum(array, target);
        assertArrayEquals(expected, actual);
    }
}