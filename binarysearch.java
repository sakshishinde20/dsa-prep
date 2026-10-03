package Easy;

/*
https://leetcode.com/problems/binary-search/

LeetCode 704 - Binary Search
Company: Amazon
Difficulty: Easy

Approach:
- Use two pointers, start and end, to define the search range.
- Find the middle element using start and end.
- If nums[mid] equals target, return mid.
- If target is smaller than nums[mid], search the left half.
- If target is greater than nums[mid], search the right half.
- Continue until the target is found or the search range becomes empty.
- Return -1 if the target does not exist.

Pointers:
start = 0            
end = nums.length - 1   
mid = (start + end)/2  

Time: O(log n)
Space: O(1)

*/

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}