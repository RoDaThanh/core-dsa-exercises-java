package org.practice.set;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharactersChecker {
    /*
    * Requirement: Check if a string contains all unique characters.
    Example:
    Input: "abcdef"
    Output: true
    Input: "hello"
    Output: false
    Constraints:
	•	Use Set<Character> to check duplicates.
    * */

    public static boolean isUniqueChar(String input) {
        if (input == null) {
            return false;
        }

        Set<Character> charSet = new HashSet<>();

        for (Character ch : input.toCharArray()) {
            if (charSet.contains(ch)) {
                return false;
            }
            charSet.add(ch);
        }

        return true;
    }
}
