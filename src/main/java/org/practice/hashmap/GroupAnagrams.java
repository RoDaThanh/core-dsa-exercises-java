package org.practice.hashmap;

import java.util.*;

public class GroupAnagrams {
    /*
    * Requirement: Group words that are anagrams.
    Example:
    Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
    Output: [["eat","tea","ate"], ["tan","nat"], ["bat"]]
    Constraints:
        •	Use sorted string as key in a Map<String, List<String>>.
    * */

    public static List<List<String>> group(List<String> anagrams) {
        Map<String, List<String>> groupMap = new LinkedHashMap<>();
        for (String anagram : anagrams) {
            String key = sortKey(anagram);
            groupMap.computeIfAbsent(key, k -> new ArrayList<>()).add(anagram);
        }

        return groupMap.values().stream().toList();
    }

    private static String sortKey(String key) {
        char[] chars = key.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
