import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int target = 7;
        int nums[] = { 3, 4, 5, 6 };

        int[] result = twoSum(nums, target);
        System.out.print("[");
        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + ", " + result[i + 1]);
        }
        System.out.print("]");
    }

    static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (numsMap.containsKey(diff)) {
                return new int[] { numsMap.get(diff), i };
            }

            numsMap.put(num, i);
        }
        return new int[] { 0 };
    }

    // TC - O(n^2)
    // static int[] twoSum(int[] nums, int target) {

    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] + nums[j] == target) {
    // return new int[] { i, j };
    // }
    // }
    // }

    // return new int[] { 0 };
    // }
}
