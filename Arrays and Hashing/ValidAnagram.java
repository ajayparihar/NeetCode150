// ValidAnagram.java
// Determines if two strings are anagrams of each other

/**
 * Valid Anagram Problem
 * 
 * Problem: Given two strings s and t, return true if t is an anagram of s, and
 * false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase.
 * 
 * Example:
 * Input: s = "listen", t = "silent"
 * Output: true
 * 
 * Time Complexity: O(n)
 * - We traverse both strings once
 * - Array operations are O(1)
 * 
 * Space Complexity: O(1)
 * - We use a fixed-size array of 26 elements
 * 
 * How it works:
 * 1. Use array to count frequency of each letter
 * 2. Add 1 for letters in first string
 * 3. Subtract 1 for letters in second string
 * 4. If all counts are 0, strings are anagrams
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // Input validation
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        // Frequency counter array for lowercase letters (a-z)
        int[] letterCount = new int[26];

        // Process both strings simultaneously
        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i) - 'a']++;
            letterCount[t.charAt(i) - 'a']--;
        }

        // Check if all character counts are zero
        for (int count : letterCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();

        // Test case
        String s = "listen";
        String t = "silent";
        System.out.println("Are '" + s + "' and '" + t +
                "' anagrams? " + solution.isAnagram(s, t)); // Expected: true
    }
}