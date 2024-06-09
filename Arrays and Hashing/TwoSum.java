public class TwoSum {
    public static void main(String[] args) {
        int target = 7;
        int nums[] = { 3, 4, 5, 6 };

        int[] result = twoSum(nums, target);

        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { 0 };
    }
}
