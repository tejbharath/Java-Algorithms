package com.company.Hashing;

import java.util.*;

public class IntegerArraySatisfyingCondition {

    //Given an integer array nums, find all the numbers x
    // in nums that satisfy the following: x + 1 is not in nums, and x - 1 is not in nums.
    public List<Integer> findNumbers(int[] nums) {
        List<Integer> arrLst = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        for(int num: nums)
        {
            if (!set.contains(num + 1) && !set.contains(num - 1))
            {
                arrLst.add(num);
            }
        }

        return arrLst;
    }
}
