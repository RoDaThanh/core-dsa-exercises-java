package org.practice.hashmap;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GroupAnagramsTest {

    @Test
    void group_happyCase() {
        List<String> input = List.of("eat", "tea", "tan", "ate", "nat", "bat");
        List<List<String>> actual = GroupAnagrams.group(input);

        List<List<String>> expected = List.of(
                List.of("eat", "tea", "ate"),
                List.of("tan", "nat"),
                List.of("bat")
        );

        assertTrue(equalsIgnoreOrder(expected, actual));
    }

    private boolean equalsIgnoreOrder(List<List<String>> expected, List<List<String>> actual) {
        Comparator<List<String>> groupComparator = Comparator.comparing(list -> String.join(",", list));

        List<List<String>> sortedExpected = expected.stream()
                .map(list -> list.stream().sorted().toList())
                .sorted(groupComparator)
                .toList();

        List<List<String>> sortedActual = actual.stream()
                .map(list -> list.stream().sorted().toList())
                .sorted(groupComparator)
                .toList();

        return sortedExpected.equals(sortedActual);
    }

    @Test
    void group_emptyInput() {
        List<String> input = List.of();
        List<List<String>> result = GroupAnagrams.group(input);
        assertEquals(List.of(), result);
    }

    @Test
    void group_singleWord() {
        List<String> input = List.of("word");
        List<List<String>> result = GroupAnagrams.group(input);
        assertEquals(List.of(List.of("word")), result);
    }

    @Test
    void group_allSameWords() {
        List<String> input = List.of("abc", "abc", "abc");
        List<List<String>> result = GroupAnagrams.group(input);
        assertEquals(List.of(List.of("abc", "abc", "abc")), result);
    }

    @Test
    void group_noAnagrams() {
        List<String> input = List.of("a", "b", "c");
        List<List<String>> result = GroupAnagrams.group(input);
        assertTrue(result.containsAll(List.of(List.of("a"), List.of("b"), List.of("c"))));
        assertEquals(3, result.size());
    }
}
