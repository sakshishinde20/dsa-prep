package Easy;

/*
https://leetcode.com/problems/find-peak-element/

LeetCode 162
Company: Amazon
Difficulty: Medium

Pattern:
- Binary Search

Time: O(log n)
Space: O(1)

Key Idea:
Compare the middle element with its right neighbor
to decide which half may contain a peak.
*/

class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
    

        while(start < end){
            int mid = (start + end) / 2;

            if(nums[mid] < nums[mid + 1]){
                start = mid + 1;
            }else if (nums[mid] > nums[mid + 1]){
                end = mid  ;
            }else{
                return mid;
            }
            
        }
        return start;
    }

}