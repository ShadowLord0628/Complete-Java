public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int a = 130;

        b = (byte) a;

        System.out.println(b); // output: -126 //!Circular property

    }
}
