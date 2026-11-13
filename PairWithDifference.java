package Easy;

/*
GeeksforGeeks

https://www.geeksforgeeks.org/problems/pair-with-difference/1

Problem: Pair With Difference
Difficulty: Easy

Pattern:
- Sorting
- Two Pointers

Time: O(n log n)
Space: O(1) auxiliary space (excluding sorting implementation)

Key Idea:
Sort the array and use two pointers to find
a pair of elements whose absolute difference
is equal to the given integer x.

Move the right pointer forward when the difference
is smaller than x, and move the left pointer forward
when the difference is greater than x.

Return true if such a pair exists; otherwise,
return false.
*/

class Solution {
    public boolean findPair(int[] arr, int x) {
        int i = 0;
        int j = 1;
        Arrays.sort(arr);

        while (j < arr.length) {
            if (arr[j] - arr[i] == x) {
                return true;
            } else if (arr[j] - arr[i] < x) {
                j++;
            } else if (arr[j] - arr[i] > x) {
                i++;
                if (i == j) {
                    j++;
                }
            }

        }
        return false;

    }
}
