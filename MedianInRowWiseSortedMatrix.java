package Easy;

/*
Problem: Median in a Row-Wise Sorted Matrix
https://www.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1
Platform: GeeksforGeeks
Difficulty: Medium
Approach: Binary Search on Answer

Time Complexity: O(R * log(C) * log(Range))
Space Complexity: O(1)

Concepts:
1. Binary Search
2. Upper Bound
3. Matrix Traversal
4. Counting Elements
*/

class Solution {
    public int median(int[][] mat) {

        int r = mat.length;
        int c = mat[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < r; i++) {
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][c - 1]);
        }

        int desired = (r * c + 1) / 2;

        while (low < high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            for (int i = 0; i < r; i++) {

                int left = 0;
                int right = c;

                while (left < right) {

                    int m = left + (right - left) / 2;

                    if (mat[i][m] <= mid) {
                        left = m + 1;
                    } else {
                        right = m;
                    }
                }

                count += left;
            }

            if (count < desired) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
