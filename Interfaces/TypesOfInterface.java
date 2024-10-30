package Interfaces;

//! Functional interface
@FunctionalInterface // annotation for functional interface
// interface A {
// void show(int i);

// }

interface A {
    int add(int i, int j);
}

// class B implements A {
// public void show() {
// System.out.println("In show");
// }
// }

public class TypesOfInterface {
    public static void main(String[] args) {
        // ? using class to implement interface
        // A obj = new B();
        // obj.show()

        // ? using anonymous class
        // A obj = new A() {
        // public void show() {
        // System.out.println("In show");
        // }
        // };

        // obj.show();

        // ? Using lambda expressions
        // ! ** Lambda expressions can be only used with functional interface
        A obj = (i, j) -> i + j; // automatically returns
        int r = obj.add(5, 7);
        System.out.println(r);

    }
}

/*
 * Types of Interface :-
 * 1. Normal:
 * normal interface with one or more method.
 * interface ABC {
 * method1();
 * method2();
 * .
 * .
 * }
 * 
 * 2. Functional(SAM):
 * Single Abstract Method(SAM)
 * interface ABC {
 * method();
 * }
 * 
 * 3. Marker:
 * blank interface for compiler for serialization
 * interface ABC {
 * 
 * }
 */
