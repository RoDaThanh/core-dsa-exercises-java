package org.practice.hashmap;

import java.util.*;

public class TwoSum {
    /*
    * Requirement: Return indices of two numbers that add up to a target sum.
    Example:
    Input: [2, 7, 11, 15], target = 9
    Output: [0, 1]
    Constraints:
	•	Use Map<Integer, Integer> to store (value → index).
    * */

    public static int[] findTwoSum(int[] arr, int sum) {
        if (arr == null || arr.length == 0) {
            return new int[]{};
        }

        Map<Integer, Integer> twoSumMap = new HashMap<>();
        for (int i = 0; i < arr.length; i ++) {
            int targetNumnber = sum - arr[i];
            if (twoSumMap.containsKey(targetNumnber)) {
                return new int[]{twoSumMap.get(targetNumnber), i};
            } else {
                twoSumMap.put(arr[i], i);
            }

        }

        return new int[]{};
    }

}
