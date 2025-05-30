// ValidAnagram.java
// Determines if two strings are anagrams of each other

/**
 * Checks if two strings are anagrams of each other.
 * An anagram is when two strings have the same letters in different orders.
 * Example: "listen" and "silent" are anagrams.
 * 
 * Time Complexity: O(n) where n is length of strings
 * - We need to look at each character once
 * 
 * Space Complexity: O(1) constant space
 * - We use a fixed size array of 26 letters
 * 
 * How it works:
 * 1. First checks if strings are valid and same length
 * 2. Uses an array to count how many times each letter appears
 * 3. For first string: adds to count
 * 4. For second string: subtracts from count
 * 5. If counts are all zero at end, they're anagrams
 */
public class ValidAnagram {

    /**
     * Checks if two strings are anagrams of each other.
     * Works only for lowercase English letters (a to z).
     */
    public boolean isAnagram(String s, String t) {
        // Check if strings are valid (not null and same length)
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        // Array to keep count of each letter (a=0, b=1, ..., z=25)
        int[] letterCount = new int[26];

        // Count letters in both strings at once
        for (int i = 0; i < s.length(); i++) {
            // Add 1 for letters in first string
            letterCount[s.charAt(i) - 'a']++;
            // Subtract 1 for letters in second string
            letterCount[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        // If any count is not zero, strings are not anagrams
        for (int count : letterCount) {
            if (count != 0) return false;
        }
        
        // All counts are zero, so they are anagrams
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();
        
        // Test with a simple anagram
        System.out.println("Is 'listen' and 'silent' anagram? " + 
            solution.isAnagram("listen", "silent"));  // should print: true
    }
}