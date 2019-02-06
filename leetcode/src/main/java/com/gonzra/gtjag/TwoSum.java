package com.gonzra.gtjag;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*
    Questions and Assumptions
    - Could nums be empty or null?
    - Could target be negative?
    Lets assume that nums can be null or empty. Also, lets assume that target can be negative or positive
     */

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array \"nums\" cannot be neither null nor empty");
        }

        int[] result = new int[2];
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currValue = nums[i];

            if (indexMap.containsKey(target - currValue)) {
                result[0] = indexMap.get(target - currValue);
                result[1] = i;
                return result;
            }
            indexMap.put(currValue, i);
        }
        return result;
    }

}
