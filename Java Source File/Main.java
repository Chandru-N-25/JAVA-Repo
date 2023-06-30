abstract class Kgm {
    public abstract void development();

    public abstract void fullStack();

    public void implementation() {
        System.out.println("Implementation in progress...");
    }
}

class Developer extends Kgm {
    public void development() {
        System.out.println("Development in progress...");
    }

    public void fullStack() {
        System.out.println("Full stack development in progress...");
    }
}

class Main {
    public static void main(String[] args) {
        Developer dev = new Developer();

        dev.development();
        dev.fullStack();
        dev.implementation();
    }
}
