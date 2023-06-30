interface MyMethodOverloading {
    void myMethod();
    void myMethod(int num);
}

class MyClass implements MyMethodOverloading {
    public void myMethod() {
        System.out.println("Method without parameters");
    }

    public void myMethod(int num) {
        System.out.println("Method with parameter: " + num);
    }
}

public class MyMethodOverloading1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();
        obj.myMethod(10);
    }
}
