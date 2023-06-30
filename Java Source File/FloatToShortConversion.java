public class FloatToShortConversion {
    public static void main(String[] args) {
        float f = 1000.56f;
        short s;

        s = (short) f;

        System.out.println("Original float value: " + f);
        System.out.println("Converted short value: " + s);
    }
}
