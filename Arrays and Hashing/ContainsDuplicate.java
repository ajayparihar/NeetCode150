import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

/**
 * The ContainsDuplicate class provides a solution to check if an array contains any duplicate elements.
 * This implementation uses a HashSet for O(n) time complexity.
 */
public class ContainsDuplicate {

    /**
     * Checks if the given array contains any duplicate integers.
     * Uses a HashSet to track seen numbers, providing O(n) time complexity
     * and O(n) space complexity.
     *
     * @param nums the array of integers to check
     * @return true if there is at least one duplicate, false otherwise
     */
    public boolean containsDuplicate(int[] nums) {
        // Input validation
        if (nums == null || nums.length < 2) {
            return false;
        }

        // Create a HashSet to store unique numbers
        Set<Integer> uniqueNums = new HashSet<>();

        // Add each number to the set and check if it was already present
        for (int num : nums) {
            if (!uniqueNums.add(num)) {
                // If add returns false, the number was already in the set
                return true;
            }
        }

        // No duplicates found
        return false;
    }

    /**
     * Main method to test the ContainsDuplicate solution with example cases.
     */
    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        
        // Test case 1: Array with duplicates
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test case 1: " + Arrays.toString(nums1) + 
                         " contains duplicates: " + solution.containsDuplicate(nums1));  // Expected: true
        
        // Test case 2: Array without duplicates
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test case 2: " + Arrays.toString(nums2) + 
                         " contains duplicates: " + solution.containsDuplicate(nums2));  // Expected: false
        
        // Test case 3: Array with multiple duplicates
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test case 3: " + Arrays.toString(nums3) + 
                         " contains duplicates: " + solution.containsDuplicate(nums3));  // Expected: true
        
        // Test case 4: Empty array
        int[] nums4 = {};
        System.out.println("Test case 4: Empty array contains duplicates: " + 
                         solution.containsDuplicate(nums4));  // Expected: false
    }
}