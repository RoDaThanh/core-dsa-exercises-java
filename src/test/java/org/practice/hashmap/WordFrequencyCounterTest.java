package org.practice.hashmap;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class WordFrequencyCounterTest {
    
    @Test
    void testSimpleSentence() {
        String input = "hello world hello";
        Map<String, Integer> expected = Map.of("hello", 2, "world", 1);
        assertEquals(expected, WordFrequencyCounter.counter(input));
    }

    @Test
    void testWithPunctuationAndCase() {
        String input = "Hello, world! HELLO.";
        Map<String, Integer> expected = Map.of("hello", 2, "world", 1);
        assertEquals(expected, WordFrequencyCounter.counter(input));
    }

    @Test
    void testEmptyString() {
        String input = "";
        Map<String, Integer> expected = Collections.emptyMap();
        assertEquals(expected, WordFrequencyCounter.counter(input));
    }

    @Test
    void testOnlyPunctuation() {
        String input = "!@#$%^&*()_+";
        Map<String, Integer> expected = Collections.emptyMap();
        assertEquals(expected, WordFrequencyCounter.counter(input));
    }

    @Test
    void testWithNumbersAndWords() {
        String input = "Test 123 test, 123.";
        Map<String, Integer> expected = Map.of("test", 2, "123", 2);
        assertEquals(expected, WordFrequencyCounter.counter(input));
    }

    @Test
    void testMultipleSpaces() {
        String input = "   spaced   out   words   ";
        Map<String, Integer> expected = Map.of("spaced", 1, "out", 1, "words", 1);
        assertEquals(expected, WordFrequencyCounter.counter(input));
    }
}
