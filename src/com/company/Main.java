package com.company;

import com.company.SlidingWindow.BinaryStringFlipOnceLongestPattern;
import com.company.SlidingWindow.LargestSumofSubArrayWithFixedSize;
import com.company.SlidingWindow.LengthOfLongestSubArrayMatchingSum;
import com.company.SlidingWindow.NumberOfSubArraysInArray;
import com.company.TwoPointers.CombineTwoSortedArray;
import com.company.TwoPointers.FindSubSequenceString;
import com.company.TwoPointers.IsTargetSortedIntegerArray;
import com.company.TwoPointers.SortSquaresofIntegerArray;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        PalindromeUsingTwoPointers p = new PalindromeUsingTwoPointers();
//        System.out.println(p.isPalindrome("racecar"));

//        IsTargetSortedIntegerArray f = new IsTargetSortedIntegerArray();
//        System.out.println(f.IsTargetInArrayEfficient(new int [] {2, 6, 8, 9, 12}, 21));

//        CombineTwoSortedArray c = new CombineTwoSortedArray();
//        int[] res = c.combineArrays(new int[] {1, 4, 7, 20}, new int[] {3, 5, 6});
//        for (int i = 0; i < res.length; i++) {
//            System.out.println(res[i]);
//        }

//        FindSubSequenceString f = new FindSubSequenceString();
//        System.out.println(f.findSubSequence("abcde", "ace"));

//        SortSquaresofIntegerArray s = new SortSquaresofIntegerArray();
//        int[] res = s.sortedSquares(new int[] {-4, -1, 0, 3, 10});
//        for (int i = 0; i < res.length; i++) {
//            System.out.println(res[i]);
//        }

//        LengthOfLongestSubArrayMatchingSum l = new LengthOfLongestSubArrayMatchingSum();
//        System.out.println(l.findLength(new int[] {3,1,2,7,4,2,1,1,5}, 8));

//        BinaryStringFlipOnceLongestPattern b = new BinaryStringFlipOnceLongestPattern();
//        System.out.println(b.findLength("11001011"));

//        NumberOfSubArraysInArray n = new NumberOfSubArraysInArray();
//        System.out.println(n.numSubarrayProductLessThanK(new int[] {10, 5, 2, 6}, 100));

        LargestSumofSubArrayWithFixedSize l = new LargestSumofSubArrayWithFixedSize();
        System.out.println(l.findBestSubarray(new int[] {3, -1, 4, 12, -8, 5, 6}, 4));
    }
}
