package tests;

import main.ContainsDuplicate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ContainsDuplicateTest {

    @Test
    public void test1() {

        int[] input = new int[] {1, 2, 3};
        assertFalse(ContainsDuplicate.containsDuplicate(input));
    }

}