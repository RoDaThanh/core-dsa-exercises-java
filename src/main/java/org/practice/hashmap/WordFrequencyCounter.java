package org.practice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    /*
    * Requirement: Count how many times each word appears in a string.
    Example:
    Input: "hello world hello"
    Output: {hello=2, world=1}
    Constraints:
	•	Clean punctuation, convert to lowercase.
    * */

    public static Map<String, Integer> counter(String input) {
        if (input == null || input.length() == 0) {
            return new HashMap<>();
        }

        String[] wordList = input.toLowerCase().strip().split("[\\p{Punct}\\s+]");
        Map<String, Integer> worCounter = new HashMap<>();
        for (String st : wordList) {
            if (!st.isEmpty()) {
                worCounter.put(st, worCounter.getOrDefault(st, 0) + 1);
            }
        }
        return worCounter;
    }
}
