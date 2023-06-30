public class ProgramExample {
    private static int staticVariable;
    private int instanceVariable;

    static {
        System.out.println("Static block executed");
        staticVariable = 10;
    }

    {
        System.out.println("Instance initialization block executed");
        instanceVariable = 20;
    }

    public ProgramExample() {
        this(0); 
        System.out.println("Default constructor executed");
    }

    public ProgramExample(int value) {
        this.instanceVariable = value;
        System.out.println("Parameterized constructor executed");
    }

    public static void staticMethod() {
        System.out.println("Static method called");
    }

    public void nonStaticMethod() {
        System.out.println("Non-static method called");
    }

    public void displayVariables() {
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Instance Variable: " + instanceVariable);
    }

    public int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ProgramExample.staticMethod();

        ProgramExample obj1 = new ProgramExample();
        obj1.nonStaticMethod();
        obj1.displayVariables();

        ProgramExample obj2 = new ProgramExample(30);
        obj2.nonStaticMethod();
        obj2.displayVariables();

        int sum = obj2.calculateSum(5, 10);
        System.out.println("Sum: " + sum);
    }
}
