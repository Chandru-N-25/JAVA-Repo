class Student {
    TestThis6 obj;

    Student(TestThis6 obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.data);
    }
}

class TestThis6 {
    int data = 10;

    TestThis6() {
        Student b = new Student(this);
        b.display();
    }

    public static void main(String args[]) {
        TestThis6 a = new TestThis6();
    }
}
