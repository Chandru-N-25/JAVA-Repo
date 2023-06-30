import java.util.Scanner;

class ElseIfExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark:");

        int mark = sc.nextInt();

        if (mark <= 35) {
            System.out.println("Your grade is F");
        } else if (mark <= 75 && mark >= 36) {
            System.out.println("Your grade is B");
        } else if (mark <= 90 && mark >= 76) {
            System.out.println("Your grade is A");
        } else if (mark <= 100 && mark >= 91) {
            System.out.println("Your grade is O");
        } else {
            System.out.println("Invalid Number");
        }

    }
}