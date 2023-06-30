class Person {
    private String name;
    private int age;

    public Person() {
        this("Chandru", 18);
    }

    public Person(String name) {
        this.name = name;
        this.age = 18; 
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.displayInfo();

        System.out.println();

        Person person2 = new Person("Ajay");
        person2.displayInfo();

        System.out.println();

        Person person3 = new Person("Barath", 25);
        person3.displayInfo();
    }
}
