package com.company.PrefixSum;

import java.util.Arrays;

public class KRadiusSubArrayAverages {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int elemCount = (2 * k) + 1;

        if (k == 0)
        {
            return nums;
        }

        int[] res = new int[n];
        Arrays.fill(res, -1);

        if (elemCount > n) {
            return res;
        }

        long[] prefix = new long[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int m = k; m < n - k; m++) {
            if (m != k) {
                res[m] = (int) ((prefix[m + k] - prefix[m - k - 1]) / elemCount);
            } else {
                res[m] = (int) (prefix[m + k] / elemCount);
            }
        }

        return res;
    }
}
