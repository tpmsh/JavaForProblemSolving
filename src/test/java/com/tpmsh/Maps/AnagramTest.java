package com.tpmsh.Maps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    MapUsageEasy solution;

    @BeforeEach
    void setUp() {
        this.solution = new MapUsageEasy();
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