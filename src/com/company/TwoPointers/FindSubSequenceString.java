package com.company.TwoPointers;

public class FindSubSequenceString {

    // origStr = "abcde"; subString = "ace"
    public boolean findSubSequence(String origStr, String subStr)
    {
        int i = 0, j = 0;

        while (i < origStr.length() && j < subStr.length())
        {
            if (subStr.charAt(j) == origStr.charAt(i))
            {
                j++;
            }
            i++;
        }
        return j == subStr.length();
    }
}
