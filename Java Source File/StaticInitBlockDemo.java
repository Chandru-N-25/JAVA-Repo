public class StaticInitBlockDemo {
    private static int count;

    static {
        count = 0; 
        System.out.println("Static initialization block executed");
    }

    public StaticInitBlockDemo() {
        count++;
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        StaticInitBlockDemo obj1 = new StaticInitBlockDemo();
        StaticInitBlockDemo obj2 = new StaticInitBlockDemo();
        System.out.println("Count: " + count);
    }
}
