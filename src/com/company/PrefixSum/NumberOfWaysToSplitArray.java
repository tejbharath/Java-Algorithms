package com.company.PrefixSum;

public class NumberOfWaysToSplitArray {
    //nums = [10, 4, -8, 7]
    // Prefix = [10, 14, 6, 13]
    // split 1: left split sum = 10, right sum = 13 - 10 = 3 - > 10 > 3 so valid, count = 1
    // split 2: left split sum = 14, right sum = -1, so valid , count = 2
    // split 3: left split sum = 6,  right sum = 13 - 6 = 7
    public int waysToSplitArray(int[] nums) {

        int n = nums.length;
        long[] prefix = new long[n];
        prefix[0] = nums[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        
        int count = 0;

        for (int i = 0; i < n-1; i++) {
            long leftSection = prefix[i];
            long rightSection = prefix[n-1] - prefix[i];

            if (leftSection > rightSection)
            {
                count++;
            }
        }
        return count;
    }
}
