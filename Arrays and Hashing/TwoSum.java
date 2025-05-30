import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/**
 * Two Sum Problem
 * 
 * Problem: Given an array of integers nums and an integer target, return
 * indices of the two numbers
 * such that they add up to target.
 * 
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * 
 * Time Complexity: O(n)
 * - We traverse the array once
 * - HashMap operations are O(1)
 * 
 * Space Complexity: O(n)
 * - We use a HashMap to store numbers and their indices
 * 
 * How it works:
 * 1. Use HashMap to store numbers we've seen
 * 2. For each number, check if (target - number) exists in HashMap
 * 3. If found, return both indices
 * 4. If not found, store current number and continue
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store numbers we've seen and their indices
        Map<Integer, Integer> seenNumbers = new HashMap<>();

        // Iterate through each number in the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement we need to find
            int complement = target - nums[i];

            // If we've seen the complement before, we found our solution
            if (seenNumbers.containsKey(complement)) {
                return new int[] { seenNumbers.get(complement), i };
            }

            // Store current number and its index for future lookups
            seenNumbers.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Test case
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println("Positions of numbers adding to " + target +
                " in " + Arrays.toString(nums) + ": " +
                Arrays.toString(solution.twoSum(nums, target))); // Expected: [0, 1]
    }
}