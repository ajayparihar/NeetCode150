import java.util.*;

public class SingleNumber_HashSet {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(singleNum(nums));
    }

    static int singleNum(int[] nums) {

        Set<Integer> freqSet = new HashSet<>();

        for (int num : nums) {
            if (freqSet.contains(num)) {
                freqSet.remove(num);
                continue;
            }

            freqSet.add(num);
        }
        return new ArrayList<>(freqSet).get(0);
    }
}
