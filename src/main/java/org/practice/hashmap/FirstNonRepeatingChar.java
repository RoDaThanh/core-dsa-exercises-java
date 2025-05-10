package org.practice.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    /*Requirement: Return first non-repeating character in a string.
    Example:
    Input: "aabbcddfe"
    Output: 'c'
    Constraints:
    •	Use LinkedHashMap to preserve insertion order.*/
    public static char findFirst(String input) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for (Character character : input.toCharArray()) {
            charMap.put(character, charMap.getOrDefault(character, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0';
    }
}
