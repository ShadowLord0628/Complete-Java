package Encapsulation;

class A {
    public A() {
        System.out.println("In A");
    }

    public A(int n) {
        this();
        System.out.println("In A int " + n);
    }
}

class B extends A {
    public B() {
        // super(5);
        super(5);
        System.out.println("In B");
    }

    public B(int n) {
        // super(n);
        this(); // executes the constructor of object
        System.out.println("In B int " + n);
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        B obj = new B(5);
        // output :
        // In A int 5
        // In B
    }
}

/*
 * Every constructor has default method super()
 * 
 * super() - calls the constructor of super class
 * 
 * if you want to call parameterized constructor of super class then u have to
 * give parameter to super() explicitly
 * 
 */

/*
 * Every class in java extends the object class
 */
