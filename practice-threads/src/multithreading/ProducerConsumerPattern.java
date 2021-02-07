package multithreading;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerPattern {

    private List<Integer> numberList = new ArrayList<>();
    private final Object lock = new Object();
    private static final int UPPER_LIMIT = 5;
    private static final int LOWER_LIMIT = 0;
    private int value =0;
    public void producer() throws InterruptedException{
        synchronized (this) {
            System.out.println("Running producer thread...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Again Running producer thread...");
        }
    }

    public void consumer() throws InterruptedException {
        synchronized (this) {
            System.out.println("Running consumer thread...");
            notify();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
