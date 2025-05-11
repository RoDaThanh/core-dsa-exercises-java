package org.practice.set;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionIntersection {
    /*Requirement:
    •	Return union and intersection of two arrays.
    Example:
    Input: [1, 2, 3], [2, 3, 4]
    Union: [1, 2, 3, 4]
    Intersection: [2, 3]
    Constraints:
    •	Use Set operations.*/

    public static Set<Integer> getUnion(int[] arr1, int[] arr2) {
        Set<Integer> union = new HashSet<>();
        union.addAll(Arrays.stream(arr1).boxed().collect(Collectors.toSet()));
        union.addAll(Arrays.stream(arr2).boxed().collect(Collectors.toSet()));
        return union;
    }

    public static Set<Integer> getIntersection(int[] arr1, int[] arr2) {
        Set<Integer> firstSet = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> res = new HashSet<>();

        for (int temp : arr2) {
            if (firstSet.contains(temp)) {
                res.add(temp);
            }
        }
        return res;
    }
}
