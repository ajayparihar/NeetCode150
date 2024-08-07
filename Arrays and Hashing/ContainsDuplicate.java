import java.util.HashMap;

public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4, 5, 5 };
    System.out.println(hasDuplicate(nums));
}

static boolean hasDuplicate(int nums[]) {
    HashMap<Integer, Void> hashMap = new HashMap<>();

    for (int i : nums) {
        if (hashMap.containsKey(i)) {
            return true;
        }
        hashMap.put(i, null);
    }
    return false;
}

// Brutforce

// static boolean hasDuplicate(int[] nums) {
// for (int i = 0; i <= nums.length - 1; i++) {
// for (int j = i + 1; j <= nums.length - 1; j++) {
// if (nums[i] == nums[j]) {
// return true;
// }
// }
// }
// return false;
// }
