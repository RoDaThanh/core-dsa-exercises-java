package org.practice.array;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RemoveDuplicatesTest {

    @Test
    void testRemoveNormal() {
        int[] input = {1, 2, 3, 2, 4, 1};
        int[] res = RemoveDuplicates.remove(input);
        assertArrayEquals(new int[]{1, 2, 3, 4}, res);
    }

    @Test
    void testRemoveNormal_2() {
        int[] input = {1, 2, 3, 4, 2, 3, 4, 5, 4};
        int[] res = RemoveDuplicates.remove(input);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, res);
    }
}
