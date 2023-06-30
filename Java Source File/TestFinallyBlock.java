class TestFinallyBlock {
    public static void main(String args[]) {
        try {
            // below code do not throw any exception
            int data = 25 / 5;
            System.out.println(data);
        }
        // catch won't be executed
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of phe code...");
    }
}
