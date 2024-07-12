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
        int start = 0;
        int end = numbers.length - 1;

        int num_a, num_b;

        while (start < end) {
            num_a = numbers[start];
            num_b = numbers[end];

            if (num_a + num_b == target)
                break;

            if (num_a + num_b < target) {
                start++;
                continue;
            }
            end--;
        }
        return new int[] { start + 1, end + 1 };
    }
}
