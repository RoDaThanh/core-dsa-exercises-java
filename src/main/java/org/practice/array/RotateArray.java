package org.practice.array;

public class RotateArray {

    /*
    Requirement: Rotate array to the right by k steps.

    Example:
    Input: [1, 2, 3, 4, 5], k = 2
    Output: [4, 5, 1, 2, 3]

    Constraints:
    Rotate in-place if possible.
    Handle k > length (use k = k % length).
    * */
    public static void rotate(int[] arr, int k) {
        if (k == 0 || arr.length == 0) return;

        if (k > arr.length) k = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
