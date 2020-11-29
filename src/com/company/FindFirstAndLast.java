package com.company;

public class FindFirstAndLast {
    public int[] searchRange(int[] nums, int target) {

        int[] res  = new int[2];
        res[0] = res[1] = -1;
        if(nums.length == 0){
            return res;
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left)/2;
        res[0] = FindIndexOnLeftPart(nums, left, right, target);
        res[1] = FindIndexOnRightPart(nums, left, right, target);
        return res;
    }

    private int FindIndexOnRightPart(int[] nums, int left, int right, int target) {

        while(left <= right){
            int mid = left + (right - left)/2;

            if(target > nums[mid]){
                left = mid + 1;
            }
            else if(target < nums[mid]){
                right = mid - 1;
            }
            else{
                if(mid == right || nums[mid+1] > target){ // If last element or next element > target, mid will be the index of
                    return mid;                           // right most element
                }
                if(nums[mid+1] == target){
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

    private int FindIndexOnLeftPart(int[] nums, int left, int right, int target) {
        while(left <= right){

            int mid = left + (right - left)/2;

            if(target > nums[mid]){
                left = mid + 1;
            }
            else if(target < nums[mid]){
                right = mid - 1;
            }
            else{
                if(mid == left || nums[mid-1] < target){ // If last element or left element > target, mid will be the index of
                    return mid;                           // right most element
                }
                if(nums[mid-1] == target){
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
