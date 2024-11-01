class Calculator {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // ! Method overloading
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

}

public class Overloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        int r1 = obj.add(3, 4);
        int r2 = obj.add(3, 4, 5);

        System.out.println(r1 + " " + r2);
    }
}
