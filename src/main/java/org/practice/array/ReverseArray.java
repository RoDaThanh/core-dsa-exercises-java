package org.practice.array;

public class ReverseArray {
    /*
    Requirement: Reverse the elements of the array in-place.
    Example:
    Input: [1, 2, 3, 4, 5]
    Output: [5, 4, 3, 2, 1]
    Constraints:
    Must modify the original array (no new array).
    Use two-pointer technique.
    */
    public static void reverse(int[] arr) {
        int temp;
        int reverseIndex;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            reverseIndex = arr.length - 1 - i;
            arr[i] = arr[reverseIndex];
            arr[reverseIndex] = temp;
        }
    }
}
