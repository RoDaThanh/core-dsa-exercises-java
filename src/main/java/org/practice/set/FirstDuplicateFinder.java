package org.practice.set;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateFinder {
    /*
    * An integer array arr[] of size n (1 ≤ n ≤ 10⁵).
    * Each element in the array is in the range [1, 10⁶].
    *
    * The first duplicated number such that its second occurrence appears earliest.
    * If no duplicate is found, return -1.
    *
    * Input:  [2, 1, 3, 5, 3, 2]
    * Output: 3
    */
    public static void main(String[] args) {
        System.out.println(findFirstDuplicate(new int[]{2,1,3,5,3}));
    }

    public static int findFirstDuplicate(int[] arr) {
        if ( arr == null || arr.length == 0) return -1;

        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }
}
