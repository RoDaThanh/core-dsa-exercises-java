package org.practice.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseArrayTest {
    @Test
    void testNormalArray() {
        int[] input = {1, 2, 3, 4, 5};
        ReverseArray.reverse(input);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input);
    }

    @Test
    void testNormalArray_given4Element() {
        int[] input = {1, 2, 4, 5};
        ReverseArray.reverse(input);
        assertArrayEquals(new int[]{5, 4, 2, 1}, input);
    }

    @Test
    void testSingleElement() {
        int[] input = {42};
        ReverseArray.reverse(input);
        assertArrayEquals(new int[]{42}, input);
    }

    @Test
    void testEmptyArray() {
        int[] input = {};
        ReverseArray.reverse(input);
        assertArrayEquals(new int[]{}, input);
    }

    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> {
            ReverseArray.reverse(null);
        });
    }
}
