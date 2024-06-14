public class TwoSumInteger {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int target = 3;
        int[] soln = (twoSum(arr, target));
        System.out.print("[ " + soln[0] + ", " + soln[1] + " ]");
    }

    static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j] == target) && arr[i] != arr[j]) {
                    return new int[] { i + 1, j + 1 };
                }
            }
        }
        return new int[0];
    }
}
