package com.tpmsh.Strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    StringUsageEasy solution;

    @BeforeEach
    void setUp() {
        this.solution = new StringUsageEasy();
    }

    @Test
    void isPalindrome() {
        // arrange
        String input = "A man, a plan, a canal: Panama";
        // act
        boolean ans = solution.isPalindrome(input);

        // assert
        assertTrue(ans);
    }

    @Test
    void isPalindrome2() {
        // arrange
        String input = "A man, a plan, a canal: Panam7";
        // act
        boolean ans = solution.isPalindrome(input);

        // assert
        assertFalse(ans);
    }

    @Test
    void isPalindrome3() {
        // arrange
        String input = ".,";
        // act
        boolean ans = solution.isPalindrome(input);

        // assert
        assertTrue(ans);
    }
}