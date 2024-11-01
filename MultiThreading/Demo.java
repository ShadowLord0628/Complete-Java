package MultiThreading;

class Z {

}

// * But when we want to use multiple inheritance extending Thread becomes a
// problem */

// class A extends Thread {

// public void run() {
// for (int i = 0; i < 100; i++) {
// System.out.println("Hi");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// }

// class B extends Thread {

// public void run() {
// for (int i = 0; i < 100; i++) {
// System.out.println("Hello");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// }

// ? To overcome problem of inheritance we use Runnable Interface

// class A implements Runnable {

// public void run() {
// for (int i = 0; i < 5; i++) {
// System.out.println("Hi");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// }

// class B implements Runnable {

// public void run() {
// for (int i = 0; i < 5; i++) {
// System.out.println("Hello");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// }

public class Demo {
    public static void main(String[] args) {
        // Runnable obj1 = new A();
        // Runnable obj2 = new B();

        // Using Lambda Expressions

        Runnable obj1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // System.out.println(obj1.getPriority() + " " + obj2.getPriority());
        // priority 1 -> lowest 10 -> highest
        // obj2.setPriority(Thread.MAX_PRIORITY);
        t1.start(); // there must be run() method in class
        t2.start(); // there must be run() method in class
    }
}
