package Easy;

/*
https://leetcode.com/problems/two-sum/

LeetCode 1 - Two Sum
Company: Amazon
Difficulty: Easy

Pattern:
- Brute Force
- Two Pointers

Approach:
- Use two pointers i and j to check every pair.
- i selects the first element.
- j checks the elements after i.
- If nums[i] + nums[j] equals target, return their indices.
- Move j forward to check the next element.
- Move i forward and reset j to i + 1.

Pointers:
i = 0       -> selects the first element
j = i + 1   -> checks the elements after i

Time: O(n²)
Space: O(1)

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}