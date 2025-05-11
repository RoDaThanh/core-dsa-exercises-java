package org.practice.set;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class UnionIntersectionTest {

    @Test
    void getUnion_happyCase() {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 5, 6};
        Set<Integer> expected = Set.of(1, 2, 4, 5, 6);
        assertEquals(expected, UnionIntersection.getUnion(arr1, arr2));
    }

    @Test
    void getUnion_array2IsEmpty() {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {};
        Set<Integer> expected = Set.of(1, 2, 4);
        assertEquals(expected, UnionIntersection.getUnion(arr1, arr2));
    }

    @Test
    public void testGetIntersection() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 4};

        Set<Integer> expected = Set.of(2, 3);
        Set<Integer> actual = UnionIntersection.getIntersection(arr1, arr2);

        assertEquals(expected, actual);
    }

    @Test
    public void testNoIntersection() {
        int[] arr1 = {1, 5, 6};
        int[] arr2 = {2, 3, 4};

        Set<Integer> expected = Set.of();
        Set<Integer> actual = UnionIntersection.getIntersection(arr1, arr2);

        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyArrays() {
        int[] arr1 = {};
        int[] arr2 = {};

        assertEquals(Set.of(), UnionIntersection.getUnion(arr1, arr2));
        assertEquals(Set.of(), UnionIntersection.getIntersection(arr1, arr2));
    }

    @Test
    public void testDuplicatesWithinInput() {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {3, 3, 4, 4};

        assertEquals(Set.of(1, 2, 3, 4), UnionIntersection.getUnion(arr1, arr2));
        assertEquals(Set.of(3), UnionIntersection.getIntersection(arr1, arr2));
    }
}
