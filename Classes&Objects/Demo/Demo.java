class Calculator {

    int a;
    int b;

    public Calculator(int num1, int num2) {
        a = num1;
        b = num2;
    }

    public int add() {
        System.out.println("in add");
        System.out.println("    " + sub());
        return (a + b);
    }

    private int sub() {
        System.out.println("    in sub");
        return (a - b);
    }

    protected int mul() {
        System.out.println("in mul");
        return (a * b);
    }
}

public class Demo {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        // add(); //! cannot use function without the object of the class

        Calculator obj = new Calculator(num1, num2);

        int result1 = obj.add();
        // obj.sub(); // private method cannot access outside of class
        int result2 = obj.mul();

        System.out.println(result1);
        System.out.println(result2);

    }
}

// ? Object Oriented Programming
// Object - properties and behaviors
// Class - Blueprint of the object
