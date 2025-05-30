// ValidPalindrome.java
// Determines if a string is a palindrome

/**
 * Checks if a string is a palindrome.
 * A palindrome reads the same forwards and backwards, ignoring case and
 * non-alphanumeric characters.
 * Example: "A man, a plan, a canal: Panama" is a palindrome.
 * 
 * Time Complexity: O(n) where n is length of string
 * Space Complexity: O(n)
 * 
 * How it works:
 * 1. Clean the string by removing non-alphanumeric characters and converting to
 * lowercase
 * 2. Use two pointers starting from both ends of the string
 * 3. Compare characters at both pointers
 * 4. Move pointers towards center until they meet
 * 5. If all characters match, it's a palindrome
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // Handle edge cases
        if (s == null) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }

        // Clean the string: convert to lowercase and remove non-alphanumeric characters
        String cleanedString = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Initialize two pointers at the start and end of the cleaned string
        int leftPointer = 0;
        int rightPointer = cleanedString.length() - 1;

        // Compare characters from both ends moving towards the center
        while (leftPointer < rightPointer) {
            // If characters don't match, string is not a palindrome
            if (cleanedString.charAt(leftPointer) != cleanedString.charAt(rightPointer)) {
                return false;
            }
            // Move pointers towards the center
            leftPointer++;
            rightPointer--;
        }

        // If we've compared all characters and found no mismatches, it's a palindrome
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();
        System.out.println("Is 'A man, a plan, a canal: Panama' a palindrome? " +
                solution.isPalindrome("A man, a plan, a canal: Panama")); // should print: true
    }
}