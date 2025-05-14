package com.company.PrefixSum;

public class KRadiusSubArrayAverages {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int elemCount = (2*k)+1;
        int[] res = new int[n];

        if (elemCount > n)
        {
            res[0] = -1;
            return res;
        }

        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        for (int j = 0; j < k ; j++) {
            res[j] = -1;
        }

        for (int m = k; m < n-k ; m++) {
            if (m != k)
            {
                res[m] = (prefix[m+k]-prefix[m-k])/ elemCount;
            }
            else
            {
                res[m] = prefix[m+k]/ elemCount;
            }
        }

        for (int l = n-k; l < n ; l++) {
            res[l] = -1;
        }

        return res;
    }
}
