package com.company.SlidingWindow;

public class BinaryStringFlipOnceLongestPattern {

    // s = "11001011"
    public int findLength(String s)
    {
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++)
        {
            if (s.charAt(right) == '0')
            {
                zeroCount++;
            }
            while (zeroCount > 1)
            {
                // This needs to be done, because we will be incrementing left pointer in next step, so accordingly we need to correct the zeroCount.
                if (s.charAt(left) == '0')
                {
                    zeroCount--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
