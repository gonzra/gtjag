package com.gonzra.gtjag.algo.hashtable;

/*
 * Given an int array, return the indices of the two numbers that add up to a specific target value.
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
    - Can the same value be used twice? NO
    - Can the input contain no solution? Lets assume the there is exactly 1 solution

     Example:

     Input :
        nums = [2, 7, 11, 15]
        target = 9,

     Output:
        [0, 1].
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
