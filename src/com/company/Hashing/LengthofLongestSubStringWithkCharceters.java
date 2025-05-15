package com.company.Hashing;

import java.util.HashMap;
import java.util.Map;

public class LengthofLongestSubStringWithkCharceters {
    // input: 'eceba', k = 2
    // Ans: 3 - because length of 'ece' is 3
    public int findLongestSubstring(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength =  0;
        for (int right = 0; right < s.length() ; right++) {

            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while(map.size() > 2)
            {
                char l = s.charAt(left);
                map.put(l, map.getOrDefault(l, 0) - 1);
                if (map.get(l) == 0)
                {
                   map.remove(l);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
