package Easy;

/*
https://leetcode.com/problems/find-smallest-letter-greater-than-target/

LeetCode 744 - Find Smallest Letter Greater Than Target
Company: Amazon
Difficulty: Easy

Pattern:
- Binary Search
- Lower Bound

Approach:
- Use binary search to find the smallest letter strictly greater than target.
- start represents the beginning of the search range.
- end represents the exclusive end boundary.
- Calculate mid to check the middle letter.
- If letters[mid] > target, move end to mid.
- Otherwise, move start to mid + 1.
- If no greater letter exists, return the first letter using modulo.

Pointers:
start = 0               
end = letters.length      
mid = start + (end-start)/2

Time: O(log n)
Space: O(1)

*/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}