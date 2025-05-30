// ValidAnagram.java
// Determines if two strings are anagrams of each other

/**
 * The ValidAnagram class determines if two strings are anagrams of each other.
 * Two strings are considered anagrams if they have the same characters with the same frequencies.
 * For example, "anagram" and "nagaram" are anagrams.
 */
public class ValidAnagram {

    /**
     * Determines if two strings are anagrams of each other.
     * Uses a character frequency counting approach with O(n) time complexity.
     *
     * @param s First input string
     * @param t Second input string
     * @return true if s and t are anagrams, false otherwise
     */
    public boolean isAnagram(String s, String t) {
        // Input validation: check for null and length equality
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        // Array to count character frequencies (assuming lowercase a-z)
        int[] charCount = new int[26];

        // Count frequencies: increment for s, decrement for t
        // If strings are anagrams, all counts should end up as 0
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        // Verify all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }

    /**
     * Main method to test the ValidAnagram solution with example cases.
     */
    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();
        
        // Test case 1: Valid anagrams
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Test case 1: " + solution.isAnagram(s1, t1));  // Expected: true
        
        // Test case 2: Not anagrams
        String s2 = "rat";
        String t2 = "car";
        System.out.println("Test case 2: " + solution.isAnagram(s2, t2));  // Expected: false
        
        // Test case 3: Same length but not anagrams
        String s3 = "hello";
        String t3 = "world";
        System.out.println("Test case 3: " + solution.isAnagram(s3, t3));  // Expected: false
        
        // Test case 4: Empty strings (are anagrams)
        String s4 = "";
        String t4 = "";
        System.out.println("Test case 4: " + solution.isAnagram(s4, t4));  // Expected: true
    }
}