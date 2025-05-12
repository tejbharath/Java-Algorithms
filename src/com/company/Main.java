package com.company;

import com.company.TwoPointers.CombineTwoSortedArray;
import com.company.TwoPointers.IsTargetSortedIntegerArray;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        PalindromeUsingTwoPointers p = new PalindromeUsingTwoPointers();
//        System.out.println(p.isPalindrome("racecar"));

//        IsTargetSortedIntegerArray f = new IsTargetSortedIntegerArray();
//        System.out.println(f.IsTargetInArrayEfficient(new int [] {2, 6, 8, 9, 12}, 21));

        CombineTwoSortedArray c = new CombineTwoSortedArray();
        int[] res = c.combineArrays(new int[] {1, 4, 7, 20}, new int[] {3, 5, 6});
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
