package com.gonzra.gtjag.algo.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWOR {

    public int lengthOfLongestSubstring2(String s){
        if (s == null) {
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
