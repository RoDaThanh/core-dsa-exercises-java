package org.practice.array;

public class PalindromeArray {
    /*Requirement: Check if an array reads the same backward as forward.
    Example:
    Input: [1, 2, 3, 2, 1]
    Output: true
    Constraints:
     •	Use two pointers: start and end.*/

    public static boolean isPalindrome(int[] array) {
        if (array == null || array.length == 0) {
            return true;
        }

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
