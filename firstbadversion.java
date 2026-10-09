

/*
https://leetcode.com/problems/first-bad-version/

LeetCode 278 - First Bad Version
Company: Facebook, Amazon
Difficulty: Easy

Pattern:

* Binary Search

Approach:

* Use binary search to find the first bad version.
* Initialize start = 1 and end = n.
* Calculate the middle version safely.
* Check whether the middle version is bad using isBadVersion(mid).
* If it is bad, move end to mid.
* If it is good, move start to mid + 1.
* Repeat until start and end meet.
* Return start as the first bad version.

Pointers:
start = 1  -> first possible version
end = n    -> last possible version
mid        -> version being checked

Time: O(log n)
Space: O(1)

*/



/* The isBadVersion API is defined in the parent class VersionControl.
   boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}