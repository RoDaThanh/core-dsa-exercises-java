package org.practice.array;

import java.util.Arrays;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{1, 2, 3, 4, 5},3));
    }

    public static int maxSum(int[] array, int k) {
        int maxSum = 0;

        for (int value : Arrays.copyOf(array,k)) {
            maxSum += value;
        }

        int sum = maxSum;
        for (int i = k; i < array.length; i++) {
            sum += array[i] - array[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
