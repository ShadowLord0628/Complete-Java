package PolyMorphism.WrapperClass;

public class Demo {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num; // auto-boxing: converts directly

        // int num2 = num1.intValue(); // unboxing
        int num2 = num1; // auto-unboxing

        String str = "12";

        int num3 = Integer.parseInt(str);
        System.out.println(num2);
        System.out.println(num3 * 2);
    }
}
