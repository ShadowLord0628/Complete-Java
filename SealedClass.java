/*
 * // ! A sealed class is something between the abstract and final class, where it can be inherited but by limited classes only
 * 
 */
//? this permits only class B and C to inherit the class A
sealed class A permits B, C {

}

// ? permitted classes must be final, sealed or non-sealed

final class B extends A {

}

non-sealed class C extends A {

}

class D extends C {

}

public class SealedClass {
    public static void main(String[] args) {

    }
}
