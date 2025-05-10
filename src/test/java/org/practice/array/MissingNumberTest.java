package org.practice.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MissingNumberTest {

    @Test
    void findMissingNumber_givenOrderArray() {
        int[] input = {1, 2, 4, 5};
        int res = MissingNumber.findMissingNumber(input);
        assertEquals(3, res);
    }

    @Test
    void findMissingNumber_givenInOrderArray() {
        int[] input = {3, 1, 4};
        int res = MissingNumber.findMissingNumber(input);
        assertEquals(2, res);
    }

    @Test
    void findMissingNumber_givenInOrderArrayXor() {
        int[] input = {3, 1, 4};
        int res = MissingNumber.findMissingNumberXor(input);
        assertEquals(2, res);
    }
}
