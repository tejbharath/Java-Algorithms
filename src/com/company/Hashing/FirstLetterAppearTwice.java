package com.company.Hashing;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterAppearTwice {
    // str = 'abcdeda'
    // Ans = d
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();

        for(int i=0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (set.contains(c)){
                return c;
            }
            set.add(c);
        }
        return ' ';
    }

}
