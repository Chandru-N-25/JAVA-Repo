import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String args[]) {
        Scanner to = new Scanner(System.in);
        System.out.println("Enter the first value");
        int num1 = to.nextInt();
        System.out.println("sum " + (num1 += 1));
        System.out.println("sub " + (num1 -= 1));
        System.out.println("mul " + (num1 *= 2));
        System.out.println("div " + (num1 /= 2));
        System.out.println("mod " + (num1 %= 1));
    }
}
