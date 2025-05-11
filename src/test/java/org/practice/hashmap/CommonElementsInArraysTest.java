package org.practice.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommonElementsInArraysTest {

    @Test
    void findCommonElement_happyCase() {
        int[] firstArr = {1, 2, 3, 4};
        int[] secondArr = {3, 4, 5, 6};
        int[] res = CommonElementsInArrays.findCommonElement(firstArr, secondArr);

        assertArrayEquals(new int[]{3, 4}, res);
    }

    @Test
    void findCommonElement_emptyArray() {
        int[] res = CommonElementsInArrays.findCommonElement(new int[]{}, new int[]{});
        assertArrayEquals(new int[]{}, res);
    }

    @Test
    void findCommonElement_nullArray() {
        int[] res = CommonElementsInArrays.findCommonElement(null, null);
        assertArrayEquals(new int[]{}, res);
    }
}
