package com.tpmsh.Sets;

import java.util.HashSet;
import java.util.Set;

public class SetUsageEasy {

    // 217. Contains Duplicate
    // https://leetcode.com/problems/contains-duplicate/description/

    /**
     * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int n: nums) {
            if(st.contains(n)) return true;
            st.add(n);
        }
        return false;
    }


}
