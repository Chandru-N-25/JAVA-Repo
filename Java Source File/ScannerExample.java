import java.util.Scanner;

class ScannerExample {
    public static void main(String args[]) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);

        System.out.println("Enter your mark");
        float mark = sc.nextFloat();
        System.out.println("Your mark is " + mark);

        System.out.println("Enter your long value");
        long value = sc.nextLong();
        System.out.println("Your long value is " + value);

        System.out.println("Enter your double value");
        double value1 = sc.nextDouble();
        System.out.println("Your double value is " + value1);

        System.out.println("Enter your Boolean value");
        boolean value2 = sc.nextBoolean();
        System.out.println("Your Boolean value is " + value2);

        System.out.println("Enter your short value");
        short value3 = sc.nextShort();
        System.out.println("Your short value is " + value3);

        System.out.println("Enter your byte value");
        byte value4 = sc.nextByte();
        System.out.println("Your byte value is " + value4);

        System.out.println("Enter your char value");
        char value5 = sc.next().charAt(0);
        System.out.println("Your char value is " + value5);
    }
}