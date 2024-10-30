package Packages;

import tools.AdvCalc;

public class Demo {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();

        int r1 = obj.add(5, 8);
        int r2 = obj.mul(5, 8);

        System.out.println(r1 + " " + r2);
    }
}
