import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/**
 * Finds two numbers in an array that add up to a target sum.
 * Example: In array [2,7,11,15] with target 9, returns [0,1] because 2+7=9
 * 
 * Time Complexity: O(n) where n is array length
 * - We only need to go through the array once
 * - HashMap operations (put/get) take O(1) time
 * 
 * Space Complexity: O(n) where n is array length
 * - We need to store numbers in HashMap
 * - In worst case, we store almost all numbers
 * 
 * How it works:
 * 1. Uses a HashMap to remember numbers we've seen
 * 2. For each number, calculates what other number we need (complement)
 * 3. Checks if we've seen that needed number before
 * 4. If found, returns positions of both numbers
 * 5. If not found, remembers current number and continues
 */
public class TwoSum {
    
    /**
     * Returns positions of two numbers that add up to target.
     * Assumes there is exactly one solution in the array.
     */
    public int[] twoSum(int[] nums, int target) {
        // Map to store numbers we've seen and their positions
        Map<Integer, Integer> seenNumbers = new HashMap<>();
        
        // Check each number in the array
        for(int i = 0; i < nums.length; i++) {
            // Calculate the number we need to find
            int complement = target - nums[i];
            
            // If we've seen the number we need, we found a solution
            if(seenNumbers.containsKey(complement)) {
                return new int[]{seenNumbers.get(complement), i};
            }
            
            // Remember current number and its position
            seenNumbers.put(nums[i], i);
        }
        
        // No solution found (shouldn't happen per problem constraints)
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        
        // Test with array [2,7,11,15] and target 9
        System.out.println("Positions of numbers adding to 9 in [2,7,11,15]: " + 
            Arrays.toString(solution.twoSum(new int[]{2,7,11,15}, 9)));  // should print: [0, 1]
    }
}