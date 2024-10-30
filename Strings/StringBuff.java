package Strings;

public class StringBuff {
    public static void main(String[] args) {

        // gives a mutable strings
        StringBuffer sb = new StringBuffer("Harsh"); // it gives a buffer of 16 bytes changeable

        // System.out.println(sb.capacity()); // output: 21

        // System.out.println(sb.length());

        sb.append(" Chavan");

        System.out.println(sb);

        sb.insert(2, " Java ");
        System.out.println(sb);

        // StringBuffer is same as StringBuilder but StringBuffer is thread safe
    }
}
