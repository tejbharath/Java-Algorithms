package com.company.TwoPointers;

public class SortSquaresofIntegerArray {

    public int[] sortedSquares(int[] nums)
    {
        int[] sortedArr = new int[nums.length];
        // nums = [-4, -2, 1, 7, 3]
        // squares = [16, 4, 1, 49, 9]
        // SortedSquares = [1, 4, 9, 16, 49]

        int left = 0, right = nums.length-1;

        for (int i = nums.length - 1; i >= 0; i--)
        {
            if (Math.abs(nums[left]) < Math.abs(nums[right]))
            {
                sortedArr[i] = nums[right] * nums[right];
                right--;
            }
            else
            {
                sortedArr[i] = nums[left] * nums[left];
                left++;
            }
        }
        return sortedArr;
    }
}
