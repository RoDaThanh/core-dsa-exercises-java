package org.practice.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RotateArrayTest {

    @Test
    void testRotateNormal() {
        int[] input = {1, 2, 3, 4, 5};
        RotateArray.rotate(input, 2);
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, input);
    }

    @Test
    void testRotateNormal_givenK5() {
        int[] input = {1, 2, 3, 4, 5};
        RotateArray.rotate(input, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, input);
    }

    @Test
    void testRotateZero() {
        int[] input = {1, 2, 3};
        RotateArray.rotate(input, 0);
        assertArrayEquals(new int[]{1, 2, 3}, input);
    }

    @Test
    void testRotateMoreThanLength() {
        int[] input = {1, 2, 3};
        RotateArray.rotate(input, 5); // 5 % 3 = 2
        assertArrayEquals(new int[]{2, 3, 1}, input);
    }

    @Test
    void testEmptyArray() {
        int[] input = {};
        RotateArray.rotate(input, 1);
        assertArrayEquals(new int[]{}, input);
    }

    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> RotateArray.rotate(null, 2));
    }
}
