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

        Character[] res2 = revertWord(new Character[]{'T','h','e',' ','q','u','i','c','k',' ','b','r','o','w','n'});
        System.out.println(Arrays.toString(res2));

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

    public static Character[] revertWord(Character[] sentence) {
        revertWord(sentence, 0, sentence.length);
        int wordBeginingSapce = 0;
        for (int i = 0; i < sentence.length; i++ ) {
            if (sentence[i] == ' ') {
                revertWord(sentence, wordBeginingSapce, i);
                wordBeginingSapce = i + 1;
            }
            if (i == sentence.length - 1) {
                revertWord(sentence, wordBeginingSapce, i + 1);
            }
        }
        return sentence;
    }

    public static void revertWord(Character[] sentence, int from, int to) {
        int rightIndex = to - 1;
        char temp;
        for (int i = from; i < (from+to)/2; i++ ) {
            temp = sentence[i];
            sentence[i] = sentence[rightIndex];
            sentence[rightIndex] = temp;
            rightIndex--;
        }
    }
}
