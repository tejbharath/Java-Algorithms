package com.company.PrefixSum;

public class QueriesOnIntegerArray {
    // nums = [1, 6, 3, 2, 7, 2], queries = [[0,3], [2, 5], [2, 4]] and Limit = 13, the answer is boolean[] {true, false, true}
    // prefix = [1, 7, 10, 12, 19, 21]
    // Time Complexity = O(n)
    public boolean[] answerQueries(int[] nums, int[][] queries, int limit)
    {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            prefix[i] = prefix[i-1] + nums[i];
        }
        boolean[] res = new boolean[queries.length];

        for (int j = 0; j < queries.length; j++)
        {
            int x = queries[j][0], y = queries[j][1];
            int sum = prefix[y] - prefix[x] + nums[x];
            res[j] = sum < limit;
        }
        return  res;
    }
}
