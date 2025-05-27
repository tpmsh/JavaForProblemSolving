package com.tpmsh.Arrays_Hashing.Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    MapUsage solution;

    @BeforeEach
    void setUp() {
        this.solution = new MapUsage();
    }

    @Test
    void twoSum1() {
        // arrange
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        // act
        int[] ans = solution.twoSum(nums, target);
        // assert
        Arrays.stream(ans).forEach(System.out::println);
        assertArrayEquals(new int[]{1,0}, ans);
    }

    @Test
    void twoSum2() {
        // arrange
        int[] nums = new int[]{3,2,4};
        int target = 6;
        // act
        int[] ans = solution.twoSum(nums, target);
        // assert
        assertArrayEquals(new int[]{2,1}, ans);
    }

}