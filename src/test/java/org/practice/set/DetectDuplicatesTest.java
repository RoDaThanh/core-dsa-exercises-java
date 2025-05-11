package org.practice.set;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DetectDuplicatesTest {

    @Test
    void hasduplicates_duplicateArray() {
        int[] input = new int[]{1, 2, 3, 1};
        assertTrue(DetectDuplicates.hasduplicates(input));
    }

    @Test
    void hasduplicates_noDuplicateArray() {
        int[] input = new int[]{1, 2, 3, 4};
        assertFalse(DetectDuplicates.hasduplicates(input));
    }

    @Test
    void hasduplicates_emptyArray() {
        assertFalse(DetectDuplicates.hasduplicates(new int[]{}));
    }

    @Test
    void hasduplicates_null() {
        assertFalse(DetectDuplicates.hasduplicates(new int[]{}));
    }
}
