package PolyMorphism;

class A {

    public void show() {
        System.out.println("In Class A -> show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In class B -> show");
    }
}

class C extends B {
    public void show() {
        System.out.println("In class C -> show");
    }
}

public class Demo {
    public static void main(String[] args) {

        // reference of parent class and object of child class
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
    }
}
