package com.company.TwoPointers;

public class CombineTwoSortedArray {

    // [1, 4, 7, 20]
    // [3, 5, 6]
    // Ans: [1, 3, 4, 5, 6, 7, 20] TimeComplexity: O(n)

    public int[] combineArrays(int[] arr1, int[] arr2)
    {
        int i = 0, j  = 0, k = 0;
        int[] resultArr = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                resultArr[k] = arr1[i];
                i++;
                k++;
            }
            else if (arr1[i] > arr2[j])
            {
                resultArr[k] = arr2[j];
                j++;
                k++;
            }
            else // when both elements are equal, skip one element
            {
                resultArr[k] = arr1[i];
                i++;
                j++;
                k++;
            }
        }

        while (i < arr1.length)
        {
            resultArr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length)
        {
            resultArr[k] = arr2[j];
            j++;
            k++;
        }
        return resultArr;
    }
}
