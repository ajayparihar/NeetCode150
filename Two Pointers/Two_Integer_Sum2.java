public class Two_Integer_Sum2 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        int target = 3;
        int[] result = twoSumTwo(numbers, target);
        System.out.print("[ ");
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }

    static int[] twoSumTwo(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        int num_a, num_b;

        while (left < right) {
            num_a = numbers[left];
            num_b = numbers[right];

            if (num_a + num_b == target)
                break;

            if (num_a + num_b < target) {
                left++;
                continue;
            }
            right--;
        }
        return new int[] { left + 1, right + 1 };
    }
}
