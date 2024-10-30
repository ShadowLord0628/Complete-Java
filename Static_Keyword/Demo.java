package Static_Keyword;

class Mobile {
    String brand;
    int price;
    static String name; // this variable belongs to the class not the specific object

    // Static block where we can initialize static variable, it will be only called
    // once
    // static block is called when class loads

    // static {
    // name = "Phone";
    // System.out.println("In static block");
    // }

    // public Mobile() {
    // brand = "";
    // price = 200;
    // System.out.println("In constructor");
    // }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    // public static void show1() {
    // you can use static variable only in static method but it can't use instance
    // variables directly
    // System.out.println("In static method");
    // }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {

        // Class.forName("Mobile"); // loads the class without creating its object
        Mobile obj1 = new Mobile();

        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        obj1.show();

        Mobile.show1(obj1);

    }
}
