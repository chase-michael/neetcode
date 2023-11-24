package tests;

import main.TopKFrequentElements;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TopKFrequentElementsTest {

    @Test
    void shouldAcceptSingleElementArray() {
        var solution = new TopKFrequentElements();
        int[] nums = new int[] {99};
        int k = 1;
        int[] expected = new int[] {99};
        int[] actual = solution.topKFrequentElements(nums, k);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAcceptKValueOfOne() {
        var solution = new TopKFrequentElements();
        int[] nums = new int[] {99, 44, 1, 99, 2};
        int k = 1;
        int[] expected = new int[] {99};
        int[] actual = solution.topKFrequentElements(nums, k);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAcceptKValueOfTwo() {
        var solution = new TopKFrequentElements();
        int[] nums = new int[] {99, 100, 8, 16, 99, 0, 100, 3};
        int k = 2;
        int[] expected = new int[] {99, 100};
        int[] actual = solution.topKFrequentElements(nums, k);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAcceptKValueOfThree() {
        var solution = new TopKFrequentElements();
        int[] nums = new int[] {99, 5, 5, 5, 4, 3, 3, 3, 99, 99};
        int k = 3;
        int[] expected = new int[] {3, 5, 99};
        int[] actual = solution.topKFrequentElements(nums, k);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

}