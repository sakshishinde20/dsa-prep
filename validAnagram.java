
/*
https://leetcode.com/problems/valid-anagram/

LeetCode 242
Difficulty: Easy

Pattern:
- String
- Character Frequency Counting

Time: O(n)
Space: O(1)

Key Idea:
Use a frequency array of size 26.
Increment the count for characters in s
and decrement for characters in t.
If all frequencies are zero, both strings
are anagrams.
*/

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
