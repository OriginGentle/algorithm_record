package com.leetcode;

/**
 * @author ycb
 * @date 2021/9/6-9:39
 */
public class Code0704_Search {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int L = 0;
        int R = nums.length - 1;
        int mid = 0;
        while (L < R) {
            mid = L + ((R - L) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return nums[L] == target ? L : -1;
    }
}