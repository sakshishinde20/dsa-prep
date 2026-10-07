package Easy;

/*
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

LeetCode 34 - Find First and Last Position of Element in Sorted Array
Difficulty: Medium

Pattern:
- Binary Search

Time: O(log n)
Space: O(1)

Use binary search twice:
- First search finds the first occurrence of the target.
- Second search finds the last occurrence of the target.

When target is found:
- For first occurrence, continue searching on the left.
- For last occurrence, continue searching on the right.

If the target is not found, return [-1, -1].
*/


class Solution {
    public int[] searchRange(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        int a = -1;
        int b = -1;

        
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target > nums[mid]) {
                start = mid + 1;

            } else if (target < nums[mid]) {
                end = mid - 1;

            } else {
                a = mid;
                end = mid - 1;
            }
        }

        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target > nums[mid]) {
                start = mid + 1;

            } else if (target < nums[mid]) {
                end = mid - 1;

            } else {
                b = mid;
                start = mid + 1;
            }
        }

        return new int[]{a, b};
    }
}