package org.practice.string;

public class StringProcessing {
/*
* Write a function that receives a string and returns the length of the longest substring without repeating characters.
Example Input: "abcabcbb"
Example Output: 3 (substring "abc")
* */
    public static void main(String[] args) {
        System.out.println(process("abcabcbb"));
        System.out.println(process("abcabcbb"));
        System.out.println(process("aaaa"));
        System.out.println(process("abcde"));
        System.out.println(process("abcdbb89b"));
        System.out.println(process(""));
    }

    public static String process(String input) {
        String longestSub = "";
        StringBuilder currentSubString = new StringBuilder();

        for (Character ch : input.toCharArray()) {
            String temp = String.valueOf(ch);

            if (currentSubString.toString().contains(temp)) {
                currentSubString = new StringBuilder(currentSubString
                        .substring(currentSubString.toString().indexOf(ch) + 1));
            }

            currentSubString.append(temp);
            if (longestSub.length() < currentSubString.length()) {
                longestSub = currentSubString.toString();
            }
        }
        return longestSub;
    }

}
