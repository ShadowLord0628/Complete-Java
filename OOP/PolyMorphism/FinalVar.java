package PolyMorphism;

// stops the inheritance of the class
// final class Calculator {
//     public void show() {
//         System.out.println("IN Calc show");
//     }

//     public void add(int a, int b) {
//         System.out.println(a + b);
//     }

// }

class Calculator {
    // stops method overriding
    final public void show() {
        System.out.println("IN Calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

}

class AdvCalculator extends Calculator {
    // public void show() { // will give error
    // System.out.println("my method");
    // }
}

public class FinalVar {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        final int num = 8;
        // num is a constant now as it won't change the value due to final

        Calculator obj = new Calculator();
        obj.show();
        obj.add(5, 6);
    }
}
