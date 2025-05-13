package com.company.SlidingWindow;

public class MaximumAverageSubArray1 {
    public double findMaxAverage(int[] nums, int k) {

        if ( k <= 0 )
        {
            return 0;
        }

        double currSum = 0;
        double maxAvg = 0;
        for (int i = 0; i < k; i++)
        {
            currSum += nums[i];
        }

        maxAvg = currSum / k;

        for (int j = k; j < nums.length; j++)
        {
            currSum = currSum + nums[j] - nums[j-k];
            maxAvg = Math.max(maxAvg, currSum/k);
        }

        return maxAvg;
    }


}
