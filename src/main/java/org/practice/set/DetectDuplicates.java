package org.practice.set;

import java.util.HashSet;
import java.util.Set;

public class DetectDuplicates {
    /*
    * Requirement: Check if array has any duplicate values.
    Example:
    Input: [1, 2, 3, 4, 5, 1]
    Output: true
    Constraints:
	•	Use HashSet to track seen values.
    * */

    public static boolean hasduplicates(int[] arr) {
        Set<Integer> setValue = new HashSet<>();

        for (int temp : arr) {
            if (setValue.contains(temp)) {
                return true;
            }
            setValue.add(temp);
        }
        return false;
    }
}
