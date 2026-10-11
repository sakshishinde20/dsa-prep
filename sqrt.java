/*
https://leetcode.com/problems/sqrtx/
LeetCode 69
Company: Amazon
Difficulty: Easy

Pattern:
- Binary Search
- Math

Time: O(log n)
Space: O(1)

Key Idea:
Find the largest integer whose square
is less than or equal to x.
*/
package Easy;

class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int ans = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid == 0) {
                start = mid + 1;
            } else if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
