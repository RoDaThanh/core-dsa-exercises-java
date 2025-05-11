package org.practice.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    void findTwoSum_happyCase() {
        int[] input =  {2, 7, 11, 15};
        int[] res = TwoSum.findTwoSum(input, 9);
        Assertions.assertArrayEquals(new int[]{0, 1}, res);
    }

    @Test
    void findTwoSum_theSameValue() {
        int[] input =  {3,3};
        int[] res = TwoSum.findTwoSum(input, 6);
        Assertions.assertArrayEquals(new int[]{0, 1}, res);
    }

    @Test
    void findTwoSum_emptyArray() {
        int[] input =  {};
        int[] res = TwoSum.findTwoSum(input, 9);
        Assertions.assertArrayEquals(new int[]{}, res);
    }

    @Test
    void findTwoSum_nullArray() {
        int[] input =  {};
        int[] res = TwoSum.findTwoSum(input, 9);
        Assertions.assertArrayEquals(new int[]{}, res);
    }
}
