package org.practice.array;

public class TrippleArray {
    //    Given an array of n integers nums and a target, find the number of index triplets i, j, k
//    with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.
//
//Example:
//
//Input: nums = [-2,0,1,3], and target = 2
//Output: 2
//Explanation: Because there are two triplets which sums are less than 2:
//             [-2,0,1]
//             [-2,0,3]
    public static void main(String[] args) {
        System.out.println(findTriplet(new int[]{-2,0,1,3}, 2));
    }

    public static int findTriplet(int[] input, int target) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                for (int k = j + 1; k < input.length; k++) {
                    if (input[i] + input[j] + input[k] < target) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
