package com.company.SlidingWindow;

import com.company.Main;

public class LengthOfLongestSubArrayMatchingSum {

    //nums = [3,1,2,7,4,2,1,1,5] - target = 8
    public int findLength(int[] nums, int target)
    {
        if (nums.length == 0)
        {
            return 0;
        }

        int left = 0;
        int currSum = 0;
        int length = 0;
        for (int right = 0; right <  nums.length; right++)
        {
            currSum = currSum + nums[right];
            while (currSum > target)
            {
                currSum = currSum - nums[left];
                left++;
            }

            length = Math.max(length, right - left + 1);
        }
        return length;
    }
}
