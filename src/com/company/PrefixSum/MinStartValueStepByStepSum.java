package com.company.PrefixSum;

public class MinStartValueStepByStepSum {
    public int minStartValue(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        int min = prefix[0];
        for (int i = 1; i < prefix.length; i++) {
            min = Math.min(prefix[i], min);
        }

        if (min < 0)
        {
            return Math.abs(min) + 1;
        }
        else {
            return 1;
        }
    }
}
