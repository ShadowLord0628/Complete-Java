package Strings;

public class Demo {
    public static void main(String[] args) {

        // String name = new String("Harsh");

        String name = "Harsh"; // creates string automatically

        name = name + " Chavan";

        // System.out.println("hello, " + name.concat(" Chavan"));
        // System.out.println(name.hashCode());
        System.out.println("Hello, " + name);

        String s1 = "Harsh";
        String s2 = "Harsh";

        System.out.println(s1 == s2);

    }
}

// ! Mutable Strings -> changes
// StringBuilder or StringBuffer

// ! Immutable Strings -> unchangeable