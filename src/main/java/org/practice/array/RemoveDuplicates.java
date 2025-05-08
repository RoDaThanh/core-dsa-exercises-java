package org.practice.array;

import java.util.*;

public class RemoveDuplicates {
    /* Requirement: Remove duplicates from:

     Sorted array: return the array with unique values in place.
     Unsorted array: use Set to filter unique values.
     Example (Unsorted):

     Input: [1, 2, 2, 3, 1]
     Output: [1, 2, 3]
     Constraints:

     Return new length or array with unique values.*/
    public static int[] remove(int[] arr) {
        Set<Integer> checkingSet = new LinkedHashSet<>();
        List<Integer> res = new ArrayList<>();

        for (int temp : arr) {
            checkingSet.add(temp);
        }

        return checkingSet.stream().mapToInt(i -> i).toArray();
    }
}
