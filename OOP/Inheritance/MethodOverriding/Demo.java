package Inheritance.MethodOverriding;

class A {
    public void show() {
        System.out.println("In Class A -> Show");
    }

    public void config() {
        System.out.println("In Class A -> config");
    }
}

class B extends A {
    // Method Overriding
    public void show() {
        System.out.println("In Class B -> show");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}
