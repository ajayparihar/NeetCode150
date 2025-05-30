import java.util.HashSet;
import java.util.Set;

/**
 * Checks if an array has any number appearing more than once.
 * Example: [1,2,3,1] has duplicate (1 appears twice)
 * 
 * Time Complexity: O(n) where n is array length
 * - We need to check each number exactly once
 * - HashSet operations (add/contains) take O(1) time
 * 
 * Space Complexity: O(n) where n is array length
 * - In worst case, we store all numbers in HashSet
 * - Example: [1,2,3,4] all numbers are different
 * 
 * How it works:
 * 1. First checks if array is valid (not null or too small)
 * 2. Uses a HashSet to remember numbers we've seen
 * 3. For each number, checks if we've seen it before
 * 4. If we see a number twice, we found a duplicate
 * 5. If we finish checking all numbers, no duplicates exist
 */
public class ContainsDuplicate {

    /**
     * Returns true if any number appears at least twice in the array.
     * Works for both positive and negative numbers.
     */
    public boolean containsDuplicate(int[] nums) {
        // Check if array is valid (not null and has at least 2 numbers)
        if (nums == null || nums.length < 2) {
            return false;
        }

        // Set to store numbers we've seen
        Set<Integer> seenNumbers = new HashSet<>();

        // Check each number in the array
        for (int num : nums) {
            // If we've seen this number before, it's a duplicate
            if (!seenNumbers.add(num)) {
                return true;
            }
        }
        
        // No duplicates found after checking all numbers
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        
        // Test with a simple case
        int[] nums = {1, 2, 3, 1};  // Array with duplicate 1
        System.out.println("Does array have duplicates? " + 
            solution.containsDuplicate(nums));  // should print: true
    }
}