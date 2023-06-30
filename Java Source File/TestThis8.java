class TestThis8 {
    void display() {
        System.out.println(this);
    }

    public static void main(String args[]) {
        TestThis8 obj = new TestThis8();
        System.out.println(obj);
        obj.display();
    }
}
