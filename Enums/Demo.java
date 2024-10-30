package Enums;

enum Status {
    Running, Failed, Pending, Success;
}

enum Laptop {
    Macbook(2000), XPS(2200), Surface, Thinkpad(3000);

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("In Laptop: " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo {
    public static void main(String[] args) {
        // Status[] s = Status.values();

        // for (Status e : s) {
        // System.out.println(e + " : " + e.ordinal());
        // }

        // Status s = Status.Pending;

        // if (s == Status.Running) {
        // System.out.println("all Good");
        // } else if (s == Status.Pending) {
        // System.out.println("Please wait");
        // }

        // switch (s) {
        // case Running:
        // System.out.println("All Good");
        // break;

        // case Pending:
        // System.out.println("wait");
        // break;

        // default:
        // break;
        // }
        // }

        Laptop Laps[] = Laptop.values();

        for (Laptop lap : Laps) {
            System.out.println(lap + " : $" + lap.getPrice());
        }
    }
}
