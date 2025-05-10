package org.practice.array;

import java.util.Arrays;


public class MissingNumber {
   /* Requirement: Given array from 1 to N with one number missing, find it.
    Example:
    Input: [1, 2, 4, 5]
    Output: 3

    Constraints:
    •	Use sum formula: n(n+1)/2 minus actual sum.
	•	Or use XOR trick.*/

    public static int findMissingNumber(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int expectedSum = (max * (max + 1)) / 2;
        int sum = Arrays.stream(arr).sum();

        return expectedSum - sum;
    }

    //TODO take more time to investigate more about XOR
    public static int findMissingNumberXor(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int xor = 0;
        for (int i = 1; i <= max; i++) {
            xor ^= i;
        }

        for (int num : arr) {
            xor ^= num;
        }

        return xor;
    }

}
