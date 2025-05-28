package org.practice.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
//    /Given a string s, find the length of the longest substring without repeating characters.
//    Input: "abcabcbb"
//    Output: 3 // "abc"
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("aaaa"));
        System.out.println(lengthOfLongestSubstring("abcde"));
        System.out.println(lengthOfLongestSubstring("abcdbb89b"));
        System.out.println(lengthOfLongestSubstring(""));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> setData = new HashSet<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char character = s.charAt(right);
            while (setData.contains(character)) {
                setData.remove(s.charAt(left));
                left++;
            }
            setData.add(character);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
