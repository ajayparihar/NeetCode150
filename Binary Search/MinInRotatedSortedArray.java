public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {

        int first = 0;
        int last = nums.length - 1;

        while (first <= last) {
            if (nums[first] <= nums[last])
                return nums[first];

            int mid = first + (last - first) / 2;

            if (nums[mid] >= nums[first])
                first = mid + 1;
            else {
                last = mid;
            }
        }
        return 0;
    }
}
