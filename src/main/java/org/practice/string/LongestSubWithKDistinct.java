package org.practice.string;

import java.util.*;

public class LongestSubWithKDistinct {
//    eceba
    public static void main(String[] args) {
//        System.out.println(getLongestSub("eceeba", 2));
        System.out.println(getLongestSub("aabacbebebe", 3));
//        System.out.println("_____");
        System.out.println(getLongestSub2("aaabc", 2));
        System.out.println(getLongestSub2("aabacbebebe", 3));  // Expected: 7 → "cbebebe"

    }

    public static int getLongestSub(String input, int k) {
        int maxSub = 0;
        for (int i = 0; i < input.length(); i++) {
            Set<Character> distinctSet = new HashSet<>();
            for (int j = i; j < input.length(); j++) {
                Character character = input.charAt(j);
                distinctSet.add(character);
                if (distinctSet.size() > k) {
                    break;
                }
                maxSub = Math.max(maxSub, j - i + 1);
            }
        }
        return maxSub;
    }
    // o(n2)
    public static int getLongestSub2(String input, int k) {
        int maxSub = 0;
        int left = 0;
        Map<Character, Integer> mapDistinct = new HashMap<>();

        for (int right = 0; right < input.length(); right++) {
            char ch = input.charAt(right);
            mapDistinct.put(ch, mapDistinct.getOrDefault(ch, 0) + 1);
            while (mapDistinct.size() > k) {
                char leftChar = input.charAt(left);
                mapDistinct.put(leftChar, mapDistinct.get(leftChar) - 1);
                if (mapDistinct.get(leftChar) == 0) {
                    mapDistinct.remove(leftChar);
                }
                left++;
            }
            maxSub = Math.max(maxSub, right - left + 1);
        }
        return maxSub;
    }
}
