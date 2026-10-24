package Easy;

/*
https://leetcode.com/problems/missing-number/

LeetCode 268
Difficulty: Easy

Pattern:
- Cyclic Sort

Time: O(n)
Space: O(1)

Key Idea:
Place each number at its corresponding index when possible.
The first index that does not contain its expected number
is the missing number.
*/

class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i];

            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return nums.length;
    }
}