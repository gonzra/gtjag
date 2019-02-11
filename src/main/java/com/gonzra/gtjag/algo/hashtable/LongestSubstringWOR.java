package com.gonzra.gtjag.algo.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWOR {

    /*
    Given a string, find the length of the longest substring without repeating characters.
     */

    public int lengthOfLongestSubstring2(String s){

        /*
        Questions/Assumptions:
        - Can the inout string be null or empty: Yes, we need to code defensively for those cases
        -
         */
        if (s == null) {
            //Always check what is if input is null but be able to discuss options
            throw new IllegalArgumentException("Input String s cannot be null");
        }

        if (s.length() == 0){
            return 0;
        }

        int left = 0;
        int length = 0;
        Map<Character, Integer> charToIndex = new HashMap<>();

        for (int right = 0; right < s.length(); right++){
            char currChar = s.charAt(right);

            if (charToIndex.containsKey(currChar)){
                //Ensure that left does not go backwards
                left = Math.max(left, charToIndex.get(currChar) + 1);
            }

            charToIndex.put(currChar, right);
            length = Math.max(length, (right - left) + 1);
        }

        return length;
    }

    public int lengthOfLongestSubstring(String s){
        if (s == null) {
            throw new IllegalArgumentException("Input String s cannot be null");
        }

        if (s.length() == 0){
            return 0;
        }

        int left = 0;
        int length = 0;
        int right = 0;
        Set<Character> usedChars = new HashSet<>();

        while(left < s.length() && right < s.length()){

            if (!usedChars.contains(s.charAt(right))){
                usedChars.add(s.charAt(right++));
                length = Math.max(length, (right - left));
            }
            else {
                usedChars.remove(s.charAt(left++));
            }

        }

        return length;
    }
}
