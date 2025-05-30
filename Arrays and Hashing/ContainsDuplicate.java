import java.util.HashSet;
import java.util.Set;

    /*
     * The ContainsDuplicate class provides a method to check if an array contains any duplicate elements.
     */

    public class ContainsDuplicate {

        /**
         * Checks if the given array contains any duplicate integers.
         *
         * @param nums the array of integers to check
         * @return true if there is at least one duplicate, false otherwise
         */
        public boolean containsDuplicate(int[] nums) {
            // Create a HashSet to store unique numbers
            Set<Integer> uniqueNums = new HashSet<>();
            int sizeNums = nums.length;

            // Add each number to the set
            for (int num : nums) {
                uniqueNums.add(num);
            }

            // If the size of the set is less than the array, duplicates exist
            return sizeNums != uniqueNums.size();
        }

        public static void main(String[] args) {
            ContainsDuplicate solution = new ContainsDuplicate();
            int[] nums = {1, 2, 3, 1};
            boolean result = solution.containsDuplicate(nums);
            System.out.println("Contains duplicate: " + result);
        }
    }