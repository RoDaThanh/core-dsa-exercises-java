package org.practice.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicatedDetectionConstraints {
    /*
    Given an array of integers nums and an integer k,
    return true if there are two distinct indices i and j in the array
    such that nums[i] == nums[j] and abs(i - j) <= k.
    Example Input: nums = [1, 2, 3, 1], k = 3
    Example Output: true
    * */
    public static void main(String[] args) {
//        System.out.println(duplicateDetection(new int[] {3,5}, 1));
//        System.out.println(duplicateDetection2(new int[] {1, 2, 3, 1}, 5));
//        System.out.println(duplicateDetection2(new int[] {1, 2, 3, 1}, 3)); // true
//        System.out.println(duplicateDetection2(new int[] {1, 2, 3, 4}, 3)); // false
        System.out.println(duplicateDetection2(new int[] {1, 0, 1, 1}, 1)); // true
//        System.out.println(duplicateDetection2(new int[] {}, 1));            // false
//        System.out.println(duplicateDetection2(new int[] {1}, 1));           // false
//        System.out.println(duplicateDetection2(new int[] {1, 2, 3, 1}, 0));  // false
//        System.out.println(duplicateDetection2(new int[] {99, 88, 77, 99}, 10)); // true
    }

    public static boolean duplicateDetection(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean duplicateDetection2(int[] nums, int k) {
        if (k == 0 || nums.length == 0) {
            return false;
        }
        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        return false;
    }

}
