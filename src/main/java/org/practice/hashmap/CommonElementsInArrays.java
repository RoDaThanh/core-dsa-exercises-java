package org.practice.hashmap;

import java.util.*;

public class CommonElementsInArrays {
    /*
    * Requirement: Return elements that appear in both arrays.
    Example:

    Input: [1, 2, 3, 4], [3, 4, 5, 6]
    Output: [3, 4]
    Constraints:
	•	Use a Set for fast lookup.
    * */
    public static int[] findCommonElement(int[] firstArr, int[] secondArr) {
        if (isInvalidArrays(firstArr, secondArr)) {
            return new int[]{};
        }

        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for (int temp : firstArr) {
            firstSet.add(temp);
        }

        for (int temp : secondArr) {
            if (firstSet.contains(temp)) {
                res.add(temp);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

    private static boolean isInvalidArrays(int[] firstArr, int[] secondArr) {
        return firstArr == null || secondArr == null || firstArr.length == 0 || secondArr.length == 0;
    }
}
