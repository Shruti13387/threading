package multithreading;

public class WaitNotify {

    public void producer() {
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

    public void consumer() {
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

    public void process() {
        Thread producer = new Thread(() -> producer());
        Thread consumer = new Thread(() -> consumer());

        producer.start();
        consumer.start();
    }
}
