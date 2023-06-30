interface Kgm {
    int students = 5; 

    void development();
}

class Kgisl implements Kgm {
    public void development() {
        System.out.println("Development in progress...");
    }

    void arts() {
        System.out.println("Arts program in progress...");
    }

    void engineering() {
        System.out.println("Engineering program in progress...");
    }
}

interface Kgcas {
    void bsc();
}

class KgcasImplementation implements Kgcas {
    public void bsc() {
        System.out.println("BSc program in progress...");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Kgisl kgisl = new Kgisl();
        kgisl.development();
        kgisl.arts();
        kgisl.engineering();

        KgcasImplementation kgcasImpl = new KgcasImplementation();
        kgcasImpl.bsc();

        System.out.println("Number of students: " + Kgm.students);
    }
}
