package org.practice.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordFrequencyCounterTest {

    @Test
    void counter_happyCase() {
        int[] firstArr = {1, 2, 3, 4};
        int[] secondArr = {3, 4, 5, 6};
        int[] res = WordFrequencyCounter.counter(firstArr, secondArr);

        assertArrayEquals(new int[]{3, 4}, res);
    }

    @Test
    void counter_emptyArray() {
        int[] res = WordFrequencyCounter.counter(new int[]{}, new int[]{});
        assertArrayEquals(new int[]{}, res);
    }

    @Test
    void counter_nullArray() {
        int[] res = WordFrequencyCounter.counter(null, null);
        assertArrayEquals(new int[]{}, res);
    }
}
