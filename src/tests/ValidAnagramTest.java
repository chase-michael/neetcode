package tests;

import main.ValidAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {

    @Test
    public void test1() {
        String input1 = "";
        String input2 = "";
        assertTrue(ValidAnagram.validAnagram(input1, input2));
    }

    @Test
    public void test2() {
        String input1 = "a";
        String input2 = "a";
        assertTrue(ValidAnagram.validAnagram(input1, input2));
    }

    @Test
    public void test3() {
        String input1 = "aa";
        String input2 = "aa";
        assertTrue(ValidAnagram.validAnagram(input1, input2));
    }

    @Test
    public void test4() {
        String input1 = "azab";
        String input2 = "aabz";
        assertTrue(ValidAnagram.validAnagram(input1, input2));
    }

    @Test
    public void test5() {
        String input1 = "aab";
        String input2 = "aba";
        assertTrue(ValidAnagram.validAnagram(input1, input2));
    }

    @Test
    public void test6() {
        String input1 = "aa";
        String input2 = "aba";
        assertFalse(ValidAnagram.validAnagram(input1, input2));
    }

    @Test
    public void test7() {
        String input1 = "aab";
        String input2 = "ab";
        assertFalse(ValidAnagram.validAnagram(input1, input2));
    }

    @Test
    public void test8() {
        String input1 = "brake";
        String input2 = "front";
        assertFalse(ValidAnagram.validAnagram(input1, input2));
    }
}