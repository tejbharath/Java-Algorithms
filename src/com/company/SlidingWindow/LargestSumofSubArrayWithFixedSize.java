package com.company.SlidingWindow;

public class LargestSumofSubArrayWithFixedSize {

    public int findBestSubarray(int[] nums, int k) {

        int maxSum = 0;
        int currSum = 0;
        for (int i = 0; i < k; i++)
        {
            currSum += nums[i];
        }

        maxSum = currSum;

        for (int j = k; j < nums.length; j++)
        {
            currSum = currSum + nums[j] - nums[j-k]; // To calculate the left most index, we subtract fixedLength of the sub array from current index.
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
