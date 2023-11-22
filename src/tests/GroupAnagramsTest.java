package tests;

import main.GroupAnagrams;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsTest {

    @Test
    void shouldAcceptEmptyString() {
        String[] input = {"", ""};
        List<List<String>> expected = Arrays.asList(Arrays.asList("", ""));
        var actual = GroupAnagrams.groupAnagrams(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAcceptArrayLengthOfOne() {
        String[] input = {"a"};
        List<List<String>> expected = Arrays.asList(Arrays.asList("a"));
        var actual = GroupAnagrams.groupAnagrams(input);
        assertEquals(expected, actual);

    }

    @Test
    void shouldGroupSingleCharStrings() {
        String[] input = {"b", "b", "aba"};
        List<List<String>> expected = Arrays.asList(Arrays.asList("b", "b"), Arrays.asList("aba"));
        var actual = GroupAnagrams.groupAnagrams(input);
        assertEquals(expected, actual);

    }

    @Test
    void shouldWorkOnMixedInputs() {
        String[] input = {"bjfieow", "bat", "tab", "ta"};
        List<List<String>> expected = Arrays.asList(Arrays.asList("bat", "tab"), Arrays.asList("ta"), Arrays.asList("bjfieow"));
        var actual = GroupAnagrams.groupAnagrams(input);
        assertEquals(expected, actual);
    }
}