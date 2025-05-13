package com.company.SlidingWindow;

public class NumberOfSubArraysInArray {

    // nums = [10, 5, 2, 6], k = 100
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1)
        {
            return 0;
        }

        int left = 0;
        int currProd = 1;
        int count = 0;
        for (int right = 0; right < nums.length; right++)
        {
            currProd = currProd * nums[right];
            while(currProd >= k)
            {
                currProd = currProd / nums[left];
                left++;
            }
            // Number of valid windows ending at index right is equal to the size of the window (right - left + 1) and so we add this count
            count += (right - left + 1);
        }

        return count;
    }
}
