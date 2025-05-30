import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/**
 * The TwoSum class provides a solution to find two numbers in an array that add up to a target sum.
 * Problem: Given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target. You may assume that each input would have exactly one solution.
 */
public class TwoSum {
    
    /**
     * Finds two numbers in the array that sum up to the target value.
     * Uses a HashMap to achieve O(n) time complexity by storing complements.
     *
     * @param nums   Array of integers to search through
     * @param target The target sum to find
     * @return Array of two indices whose corresponding values sum to target
     */
    public int[] twoSum(int[] nums, int target) {
        // Map to store complements (target - current number)
        Map<Integer, Integer> numsMap = new HashMap<>();

        // Iterate through the array once, O(n) time complexity
        for(int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;

            // If we found the complement, return both indices
            if(numsMap.containsKey(complement)) {
                return new int[]{numsMap.get(complement), i};
            }
            // Store current number and its index
            numsMap.put(currentNum, i);
        }
        // No solution found (though problem states there will always be one)
        return new int[]{-1, -1};
    }

    /**
     * Main method to test the TwoSum solution with example cases.
     */
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        
        // Test case 1: Basic case
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Test case 1: " + Arrays.toString(solution.twoSum(nums1, target1)));  // Expected: [0, 1]
        
        // Test case 2: Numbers not in order
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Test case 2: " + Arrays.toString(solution.twoSum(nums2, target2)));  // Expected: [1, 2]
        
        // Test case 3: Same number used twice
        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("Test case 3: " + Arrays.toString(solution.twoSum(nums3, target3)));  // Expected: [0, 1]
    }
}