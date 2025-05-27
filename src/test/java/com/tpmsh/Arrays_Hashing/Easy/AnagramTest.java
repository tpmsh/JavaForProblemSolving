package com.tpmsh.Arrays_Hashing.Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramTest {

    MapUsage solution;

    @BeforeEach
    void setUp() {
        this.solution = new MapUsage();
    }

    @Test
    void isAnagram() {
        // arrange
        String s = "anagram";
        String t = "nagaram";

        // act
        boolean ans = solution.isAnagram(s,t);

        assertTrue(ans);
    }

    @Test
    void isAnagram2() {
        // arrange
        String s = "anagram";
        String t = "nagasam";

        // act
        boolean ans = solution.isAnagram(s,t);

        assertFalse(ans);
    }
}