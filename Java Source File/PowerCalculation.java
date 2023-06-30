public class PowerCalculation {
    public static void main(String[] args) {
        int base = 5;
        int exponent = 2;
        int result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " = " + result);
    }

    public static int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
