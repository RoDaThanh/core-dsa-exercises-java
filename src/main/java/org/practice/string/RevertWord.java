package org.practice.string;

import java.util.Arrays;

public class RevertWord {
/*        You are given a string, sentence, comprising words and leading or trailing spaces or
    multiple spaces between words. Your task is to reverse the order of its words without
    affecting the order of letters within the given word. Return the modified sentence.

    Example:
    input:
            “The quick brown fox jumped over a lazy  dog”
    Output:
            “dog lazy a over jumped fox brown quick The”*/
    public static void main(String[] args) {
        String[] res = revertWord("The    quick brown fox jumped over a lazy dog");
        System.out.println(Arrays.toString(res));

    }

    public static String[] revertWord(String sentence) {
        String[] words = sentence.split("\\s+");
        int rightIndex = words.length - 1;
        String temp = "";
        for (int i = 0; i < words.length / 2; i++ ) {
            temp = words[i];
            words[i] = words[rightIndex];
            words[rightIndex] = temp;
            rightIndex--;
        }
        return words;
    }
}
