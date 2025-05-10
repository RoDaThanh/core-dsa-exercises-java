package org.practice.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeArrayTest {

    @Test
    void isPalindrome_happyCase() {
        int[] input = {1, 2, 3, 2, 1};
        Assertions.assertTrue(PalindromeArray.isPalindrome(input));
    }

    @Test
    void isPalindrome_unHappyCase() {
        int[] input = {1, 2, 3, 2, 1, 1, 2};
        Assertions.assertFalse(PalindromeArray.isPalindrome(input));
    }

    @Test
    void isPalindrome_emptyArray() {
        Assertions.assertTrue(PalindromeArray.isPalindrome(new int[]{}));
    }

    @Test
    void isPalindrome_nullArray() {
        Assertions.assertTrue(PalindromeArray.isPalindrome(null));
    }
}
