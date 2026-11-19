package Easy;

/*
https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1
Problem: Row with Max 1s in Rowwise Sorted
Platform: GeeksforGeeks
Difficulty: Medium
Approach: Binary Search

Time Complexity: O(n * log(m))
Space Complexity: O(1)

Logic:
1. Traverse every row.
2. Find the first occurrence of 1 using Binary Search.
3. Calculate the number of ones.
4. Update the maximum count and row index.
5. Return the row index.
*/

class Solution {
    public int rowWithMax1s(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        int maxOnes = 0;
        int ans = -1;

        for (int i = 0; i < rows; i++) {

            int low = 0;
            int high = cols - 1;
            int firstOne = cols;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (arr[i][mid] == 1) {
                    firstOne = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            int countOnes = cols - firstOne;

            if (countOnes > maxOnes) {
                maxOnes = countOnes;
                ans = i;
            }
        }

        return ans;
    }
}
