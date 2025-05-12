package com.company.TwoPointers;

public class PalindromeUsingTwoPointers {

    public boolean isPalindrome(String s) {

        if (!s.isEmpty())
        {
            int left = 0, right = s.length() - 1;

            while (left < right)
            {
                if (s.charAt(left) != s.charAt(right))
                {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
        return false;
    }
}
