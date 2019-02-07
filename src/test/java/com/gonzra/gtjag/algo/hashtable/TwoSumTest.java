package com.gonzra.gtjag.algo.hashtable;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;

public class TwoSumTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void nullInput() {
        exceptionRule.expect(IllegalArgumentException.class);
        int[] nums = null;
        int target = 13;
        int[] result = test(nums, target);
    }

    @Test
    public void emptyInput() {
        exceptionRule.expect(IllegalArgumentException.class);
        int[] nums = {};
        int target = 13;
        int[] result = test(nums, target);
    }

    @Test
    public void regularInput() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = test(nums, target);
        Assert.assertThat(result.length, is(2));
        Assert.assertThat(result, is(new int[]{0,1}));
    }

    @Test
    public void negativeTarget() {
        int[] nums = {-1, 2, 7, 11, 15, -3};
        int target = -4;
        int[] result = test(nums, target);
        Assert.assertThat(result.length, is(2));
        Assert.assertThat(result, is(new int[]{0,5}));
    }

    private int[] test(int[] nums, int target) {
        TwoSum twoSumInstance = new TwoSum();
        return twoSumInstance.twoSum(nums, target);
    }
}
