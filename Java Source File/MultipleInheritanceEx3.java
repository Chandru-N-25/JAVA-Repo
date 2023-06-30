class MultipleInheritanceEx1 {
    void msg() {
        System.out.println("Hello");
    }
}

class MultipleInheritanceEx2 {
    void msg() {
        System.out.println("Welcome");
    }
}

class MultipleInheritanceEx3 extends MultipleInheritanceEx1,MultipleInheritanceEx2{//suppose if it were  

    public static void main(String args[]) {
        MultipleInheritanceEx3 obj = new MultipleInheritanceEx3();
        obj.msg();// Now which msg() method would be invoked?
    }
}
