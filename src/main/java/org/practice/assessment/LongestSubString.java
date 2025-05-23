package org.practice.assessment;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {
    //Find the longest substring without repeated characters in the given string?
    //Below is an example:
    //Input: java2novice, output: a2novice
    //Input: java_language_is_sweet, output: uage_is
    public static void main(String[] args) {
        System.out.println(getLongestSubString("java_language_is_sweet"));
    }

    public static String getLongestSubString(String str) {
        StringBuilder currentSubString = new StringBuilder();
        String longestSubString = "";
        for (char ch : str.toCharArray()) {
            String temp = String.valueOf(ch);
            if (currentSubString.toString().contains(temp)) {
                currentSubString = new StringBuilder(currentSubString.substring(
                        currentSubString.toString().indexOf(ch)+1));
            }
            currentSubString.append(ch);
            if (currentSubString.length() > longestSubString.length()) {
                longestSubString = currentSubString.toString();
            }
        }
        return longestSubString;
    }
}
