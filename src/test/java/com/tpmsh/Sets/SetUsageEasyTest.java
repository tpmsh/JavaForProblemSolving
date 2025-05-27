package com.tpmsh.Sets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetUsageEasyTest {

    SetUsageEasy solution;

    @BeforeEach
    void setUp() {
        this.solution = new SetUsageEasy();
    }

    @Test
    void containsDuplicate() {
        //arrange
        int[] nums = new int[]{1, 2, 3, 1};

        //act
        boolean ans = solution.containsDuplicate(nums);

        assertTrue(ans);
    }

    @Test
    void containsDuplicate2() {
        //arrange
        int[] nums = new int[]{1, 2, 3, 4};

        //act
        boolean ans = solution.containsDuplicate(nums);

        assertFalse(ans);
    }
}