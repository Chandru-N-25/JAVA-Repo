class TestThis5 {
    void m(TestThis5 obj) {
        System.out.println("method is invoked");
    }

    void display() {
        m(this);
    }

    public static void main(String args[]) {
        TestThis5 s1 = new TestThis5();
        s1.display();
    }
}
