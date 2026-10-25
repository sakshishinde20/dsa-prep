package Easy;

/*
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

LeetCode 448
Difficulty: Easy

Pattern:
- Cyclic Sort

Time: O(n)
Space: O(1) auxiliary space

Key Idea:
Place each number at its corresponding index.
The indexes that do not contain their expected numbers
identify the missing values.
*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans.add(j + 1);
            }
        }

        return ans;
    }
}