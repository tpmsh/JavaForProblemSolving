package com.tpmsh.Arrays_Hashing.Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    SetUsage solution;

    @BeforeEach
    void setUp() {
        this.solution = new SetUsage();
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