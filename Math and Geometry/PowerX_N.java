public class PowerX_N {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2147483648;
        System.out.print(myPow(x, n));
    }

    static double myPow(double x, int n) {
        // return Math.pow(x, n);
        if (n == 0) {
            return 1;
        }

        else if (n < 0) {
            return 1 / pow(x, Math.abs(n));
        }

        return pow(x, Math.abs(n));
    }

    static double pow(double x, int n) {
        double power = 1;
        for (int i = 0; i < n; i++) {
            power = power * x;
        }
        return power;
    }
}
