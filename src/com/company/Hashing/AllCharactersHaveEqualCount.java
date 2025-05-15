package com.company.Hashing;

import java.util.HashMap;
import java.util.Map;

public class AllCharactersHaveEqualCount {
    public boolean areOccurrencesEqual(String s) {
        if (s.isEmpty()) return false;
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int initCount = map.getOrDefault(s.charAt(0), 0);
        for (int num: map.values())
        {
            if (num != initCount)
            {
                return false;
            }
        }
        return true;
    }
}
