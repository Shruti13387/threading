package multithreading;

import java.util.stream.IntStream;

public class Synchronization {

    public static int increment1 = 0;

    public void increment1() {
        synchronized (this) {
            increment1++;
        }
    }

    public void increment2() {
        synchronized (this) {
            increment1++;
        }
    }

    public void process() {
        Thread thread1 = new Thread(() -> {
            IntStream.range(0, 100).forEach(i -> {
                System.out.println("Calling Thread1 "+ increment1);
                increment1();
            });
        });
        Thread thread2 = new Thread(() -> {
            IntStream.range(0, 100).forEach(i -> {
                System.out.println("Calling Thread2 "+ increment1);
                increment2();
            });
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The Counter is : " + increment1);
    }
}
