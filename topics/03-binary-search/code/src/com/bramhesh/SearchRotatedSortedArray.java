package com.bramhesh;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 6;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            // Left sorted

            if(nums[start] <= nums[mid]) {

                // check if target lies in the left sorted array

                if(nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;    // if yes then eliminate the right half
                } else {
                    start = mid + 1;  // else eliminate the left half
                }
            }

            // Right sorted array

            else {
                //check if target lies in the right sorted half

                if(nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;   // if yes then eliminate the left half
                } else {
                    end = mid - 1;     // else eliminate right half
                }
            }
        }
        return -1;
    }
}
