package Inheritance.SingleAndMulti;

public class Demo {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();

        int r1 = obj.add(5, 10);
        int r2 = obj.sub(17, 8);
        int r3 = obj.multi(2, 3);
        int r4 = obj.div(24, 2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
