package Interfaces;

interface Computer {

    int processor = 5; // final and static by default

    void code();
}

/**
 * InnerDemo
 */
interface Machine extends Computer {

    void run();
}

class Laptop implements Machine {
    public void code() {
        System.out.println("Code, Compile, Run");
    }

    public void run() {
        System.out.println("Running..");
    }
}

class Desktop implements Machine {
    public void code() {
        System.out.println("Code, Compile, Run : Faster");
    }

    public void run() {
        System.out.println("Running..");
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}

class Developer {
    public void devApp(Machine lap) {
        lap.code();
        lap.run();
    }
}

public class Demo {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Machine lap = new Laptop();
        Machine desk = new Desktop();
        Developer h = new Developer();
        h.devApp(desk);
    }
}
