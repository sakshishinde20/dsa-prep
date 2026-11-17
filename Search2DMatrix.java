package Easy;

/*
Problem: 74. Search a 2D Matrix
Platform: LeetCode
Difficulty: Medium
Topic: Binary Search

Approach:
1. Treat the 2D matrix as a sorted 1D array.
2. Apply Binary Search on the virtual array.
3. Convert the middle index into row and column.
4. Compare the matrix element with the target.
5. Return true if found, otherwise false.

Formula:
row = mid / n
col = mid % n

Time Complexity: O(log(m * n))
Space Complexity: O(1)
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                return true;
            }

            else if (matrix[row][col] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return false;
    }
}
