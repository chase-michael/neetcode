package tests;

import main.ProductOfArrayExceptSelf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    public void shouldAcceptPositiveValues() {
        int[] input = new int[] {1, 2, 1, 2, 1, 2, 1};
        int[] expected = new int[] {8, 4, 8, 4, 8, 4, 8};
        int[] actual = ProductOfArrayExceptSelf.productExceptSelf(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAcceptNegativeValues() {
        int[] input = new int[] {-1, -4, -3, -8};
        int[] expected = new int[] {-96, -24, -32, -12};
        int[] actual = ProductOfArrayExceptSelf.productExceptSelf(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAcceptMixedValues() {
        int[] input = new int[] {1, 3, -1, 0};
        int[] expected = new int[] {0, 0, 0, -3};
        int[] actual = ProductOfArrayExceptSelf.productExceptSelf(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAcceptArrayOfLengthTwo() {
        int[] input = new int[] {5, 5};
        int[] expected = new int[] {5, 5};
        int[] actual = ProductOfArrayExceptSelf.productExceptSelf(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAcceptArrayOfLengthThree() {
        int[] input = new int[] {5, 5, 4};
        int[] expected = new int[] {20, 20, 25};
        int[] actual = ProductOfArrayExceptSelf.productExceptSelf(input);
        assertArrayEquals(expected, actual);
    }

}