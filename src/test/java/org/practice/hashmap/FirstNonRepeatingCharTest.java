package org.practice.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstNonRepeatingCharTest {

    @Test
    void findFirst_happyCase() {
        String input = "thanhdeptrai";
        Assertions.assertEquals('n', FirstNonRepeatingChar.findFirst(input));
    }

    @Test
    void findFirst_notFound() {
        String input = "bbbbbbb";
        Assertions.assertEquals('\0', FirstNonRepeatingChar.findFirst(input));
    }

    @Test
    void findFirst_happyCaseAtTheEnd() {
        String input = "bbbbbbbc";
        Assertions.assertEquals('c', FirstNonRepeatingChar.findFirst(input));
    }
}
