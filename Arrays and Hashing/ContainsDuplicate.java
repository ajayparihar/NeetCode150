import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

/**
 * Contains Duplicate Problem
 * 
 * Problem: Given an integer array nums, return true if any value appears at
 * least twice in the array,
 * and return false if every element is distinct.
 * 
 * Example:
 * Input: nums = [1,2,3,1]
 * Output: true
 * 
 * Time Complexity: O(n)
 * - We traverse the array once
 * - HashSet operations are O(1)
 * 
 * Space Complexity: O(n)
 * - We use a HashSet to store unique numbers
 * 
 * How it works:
 * 1. Use HashSet to store numbers we've seen
 * 2. For each number, try to add it to HashSet
 * 3. If add fails, number is duplicate
 * 4. If no duplicates found, return false
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Input validation
        if (nums == null || nums.length < 2) {
            return false;
        }

        // HashSet to store unique numbers we've seen
        Set<Integer> seenNumbers = new HashSet<>();

        // Iterate through each number in the array
        for (int num : nums) {
            // HashSet.add() returns false if element already exists
            if (!seenNumbers.add(num)) {
                return true; // Found a duplicate
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        // Test case
        int[] nums = { 1, 2, 3, 1 };
        System.out.println("Does array " + Arrays.toString(nums) +
                " have duplicates? " + solution.containsDuplicate(nums)); // Expected: true
    }
}