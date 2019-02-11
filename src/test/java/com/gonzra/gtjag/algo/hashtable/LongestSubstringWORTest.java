package com.gonzra.gtjag.algo.hashtable;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class LongestSubstringWORTest {

    @Test
    public void emptyInput(){
        String s = "";
        test(s, 0);
    }

    @Test
    public void normalInput(){
        String s = "abcabcbb";
        test(s, 3);
    }

    @Test
    public void normalInput2(){
        test("pwwkew", 3);
    }

    @Test
    public void leftCannotGoBackwards(){
        test("abba", 2);
    }



    @Test
    public void sameChars(){
        test("bbbbbbbb", 1);
    }

    private void test(String s, int expectedLength){
        LongestSubstringWOR instance = new LongestSubstringWOR();
        int actualLength = instance.lengthOfLongestSubstring(s);
        Assert.assertThat(actualLength, is(expectedLength));
    }

}
