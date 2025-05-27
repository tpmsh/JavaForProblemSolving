package com.tpmsh.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapUsageEasy {

    // 242. Valid Anagram
    //https://leetcode.com/problems/valid-anagram/description/

    /**
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);

        for(char c:t.toCharArray()) {
            if(!map.containsKey(c)) return false;
            map.put(c, map.getOrDefault(c, 0) - 1);
            if(map.get(c) == 0) map.remove(c);
        }
        return map.isEmpty();
    }

    // 1. Two Sum
    //https://leetcode.com/problems/two-sum/description/
    /**
     *Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) return new int[]{i, map.get(nums[i])};
            map.put(target-nums[i], i);
        }
        return new int[]{0,0};
    }
}
