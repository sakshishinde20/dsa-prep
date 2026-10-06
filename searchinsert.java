package Easy;

/*
https://leetcode.com/problems/search-insert-position/

LeetCode 35 - Search Insert Position
Difficulty: Easy

Pattern:
- Binary Search

Time: O(log n)
Space: O(1)

Key Idea:
Use binary search to find the target.
If the target is not found, return the position
where it should be inserted.
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){ 
        int mid = (start+end)/2;  
    

    if(nums[mid] < target){
        start = mid+1;
    }else if(nums[mid] > target){
        end = mid-1;
    }else{
        return mid;
    }
    } 
    return start;
    }
}