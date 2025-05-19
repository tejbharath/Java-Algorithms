package com.company.Hashing;

import java.util.HashMap;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        int n = nums.length;
        for (int i = 0; i < n+1; i++)
        {
            map.put(i, false);
        }

        for (int num: nums)
        {
            map.put(num, true);
        }

        for (int num: map.keySet())
        {
            if(!map.getOrDefault(num, false))
            {
                return num;
            }
        }
        return 0;
    }
}
