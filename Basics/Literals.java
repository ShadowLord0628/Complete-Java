public class Literals {
    public static void main(String[] args) {

        // ! Integer Literals
        int num1 = 0b1011;
        int num2 = 0x3E;
        int num3 = 10_000_000;
        System.out.println("----------Integer Literals---------");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println();
        // ! Character literals
        System.out.println("---------Character Literals---------");
        char c = 'a';
        // c = c + 1; // it will give error
        c++;
        System.out.println(c); // output: b
        c++;
        System.out.println(c); // output: c

    }
}
