package Easy;

/*
https://www.geeksforgeeks.org/problems/sorted-matrix2333/1
Problem: Sort Matrix
Platform: GeeksforGeeks
Difficulty: Easy
Approach: Flatten Array + Sorting

Time Complexity: O(n * n * log(n * n))
Space Complexity: O(n * n)

Logic:
1. Traverse the entire matrix.
2. Store all matrix elements in a 1D array.
3. Sort the array using Arrays.sort().
4. Traverse the matrix again.
5. Place sorted elements back into the matrix row by row.
6. Return the sorted matrix.
*/

class Solution {
    public int[][] sortedMatrix(int mat[][]) {

        int n = mat.length;

        int[] arr = new int[n * n];

        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[k++] = mat[i][j];
            }
        }

        Arrays.sort(arr);

        k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = arr[k++];
            }
        }

        return mat;
    }
}
