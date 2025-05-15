package com.company.Hashing;

import java.util.*;

public class IntersectionOfMultipleArrays {
    //Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
    //Output: [3,4]

    public List<Integer> intersection(int[][] nums) {
        List<Integer> res = new ArrayList<>();
        
        int n = nums.length;
        if (n == 0)
        {
            return res;
        }
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < nums[i].length ; j++) {
                map.put(nums[i][j], map.getOrDefault(nums[i][j], 0) + 1);

                if (map.get(nums[i][j]) == n)
                {
                    res.add(nums[i][j]);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
    
}
