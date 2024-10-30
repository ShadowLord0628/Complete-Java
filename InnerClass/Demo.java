package InnerClass;

class A {
    int age;

    public void show() {
        System.out.println("In class A -> show");
    }

    // only allowed for inner class
    static class B {
        public void config() {
            System.out.println("In inner class B -> config");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();
        obj1.config();
    }
}
