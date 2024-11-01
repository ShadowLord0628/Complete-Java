package MultiThreading;

class Counter {
    int count;

    // "synchronized" by this keyword we can make sure that race condition does not
    // occur
    public synchronized void increment() {
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
                // System.out.println("obj1 : " + c.count);
                // System.out.println("obj1 done");
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
                // System.out.println("obj2 : " + c.count);
                // System.out.println("obj2 done");
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // wait for threads to complete the process
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}

// ! Race Condition:-
/*
 * When two or more processes or threads are trying to access same variable at
 * same time it is called race condition
 * 
 * DefN:
 * "A situation where multiple threads access and modify shared data concurrently, causing unpredictable results."
 * 
 * Thread Safe :
 * It means a method allows only one thread to work on it at a time.
 */

// ! Thread States:-
/*
 * States:-
 * new, runnable, running, waiting, dead
 * 
 * new -> runnable:
 * start();
 * 
 * runnable -> running:
 * run();
 * 
 * running -> waiting
 * sleep(); or wait();
 * 
 * waiting -> runnable
 * notify();
 * 
 * @Deprecated/not best practice
 * 
 * runnable, running -> dead :
 * threads go to dead state automatically when done with task
 * stop();
 * 
 */
