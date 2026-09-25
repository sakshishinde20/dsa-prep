package Easy;

/*
https://leetcode.com/problems/remove-element/

LeetCode 27
Company: Amazon
Difficulty: Easy

Pattern:
- Two Pointers

Time: O(n)
Space: O(1)

Key Idea:
Use one pointer to scan the array and another pointer
to place elements that are not equal to val.
*/


class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int k = 0;

        while(i < nums.length){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}