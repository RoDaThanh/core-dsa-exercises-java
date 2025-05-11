package org.practice.set;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UniqueCharactersCheckerTest {

    @Test
    void isUniqueChar_givenUniqueChar() {
        assertTrue(UniqueCharactersChecker.isUniqueChar("heabcd"));
    }

    @Test
    void isUniqueChar_givenNoUniqueChar() {
        assertFalse(UniqueCharactersChecker.isUniqueChar("heeabcd"));
    }

    @Test
    void isUniqueChar_emptyInput() {
        assertTrue(UniqueCharactersChecker.isUniqueChar(""));
    }

    @Test
    void isUniqueChar_nullInput() {
        assertFalse(UniqueCharactersChecker.isUniqueChar(null));
    }
}
