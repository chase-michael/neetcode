package tests;

import main.ContainsDuplicate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    @Test
    public void test1() {
        int[] input = {1, 2, 3};
        assertFalse(ContainsDuplicate.containsDuplicate(input));
    }

    @Test
    public void test2() {
        int[] input = {};
        assertFalse(ContainsDuplicate.containsDuplicate(input));
    }

    @Test
    public void test3() {
        int[] input = {1};
        assertFalse(ContainsDuplicate.containsDuplicate(input));
    }

    @Test
    public void test4() {
        int[] input = {1, 1, 2, 3};
        assertTrue(ContainsDuplicate.containsDuplicate(input));
    }

    @Test
    public void test5() {
        int[] input = {1, 2, 3, 3};
        assertTrue(ContainsDuplicate.containsDuplicate(input));
    }

    @Test
    public void test6() {
        int[] input = {1, 1, 1, 1, 1, 1};
        assertTrue(ContainsDuplicate.containsDuplicate(input));
    }

}