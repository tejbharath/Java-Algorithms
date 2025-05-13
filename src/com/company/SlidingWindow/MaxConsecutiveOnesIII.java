package com.company.SlidingWindow;

public class MaxConsecutiveOnesIII {
    //nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;
        int max = 0;
        for (int right = 0; right < nums.length; right++)
        {
            if (nums[right] == 0)
            {
                zeroCount++;
            }

            while (zeroCount > k)
            {
                if (nums[left] == 0)
                {
                    zeroCount--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
