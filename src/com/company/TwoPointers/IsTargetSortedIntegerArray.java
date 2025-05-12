package com.company.TwoPointers;

public class IsTargetSortedIntegerArray {

    //[2, 6, 8, 9, 12], target = 17 O(n2)
    public boolean IsTargetInArrayBruteForce(int[] arr, int target)
    {
        for (int i=0; i < arr.length - 1; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if (target - arr[j] == arr[i])
                {
                    return true;
                }
            }
        }
        return false;
    }

    //[2, 6, 8, 9, 12], target = 17 O(n)
    public boolean IsTargetInArrayEfficient(int[] arr, int target)
    {
        //Since sorted array we can initialize left most pointer and right most pointer and
        // increase or decrease these pointers based on the sum of respective elements
        // in correlation with the target.
        int left = 0, right = arr.length-1;
        while (left < right)
        {
            int currSum = arr[left] + arr[right];
            if (currSum == target)
            {
                return true;
            }
            else if (currSum< target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return false;
    }
}


