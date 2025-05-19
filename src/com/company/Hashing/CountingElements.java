package com.company.Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class CountingElements {
    //Given an integer array arr, count how many elements x
    // there are, such that x + 1 is also in arr.
    // If there are duplicates in arr, count them separately.

//    Input: arr = [1,2,3]
//    Output: 2
    public int countElements(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }

        int count = 0;
        for (int num: arr)
        {
            if (map.containsValue(num + 1)){
                count++;
            }
        }
        return count;
    }
}

