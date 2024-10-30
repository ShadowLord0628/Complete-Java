package AnonymousClass;

abstract class A {
    public abstract void show();

    public abstract void config();
}

public class Demo {
    public static void main(String[] args) {
        // Anonymous class
        A obj = new A() {
            public void show() {
                System.out.println("In a new show");
            }

            public void config() {
                System.out.println("In class A -> config");
            }
        }; // anonymous class for abstract class

        // here object of anonymous class is getting created not the abstract class

        obj.show();
        obj.config();
    }
}
