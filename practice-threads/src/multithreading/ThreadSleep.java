package multithreading;

import java.util.stream.IntStream;

public class ThreadSleep {

    public static void practiceThreadSleep(){
        Runnable runner1 = () -> IntStream.range(0,10).forEach( i -> {
            try {
                Thread.sleep(100);
                System.out.println("Thread 1 : "+ i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }});
        Runnable runner2 = () -> IntStream.range(0,10).forEach( i -> {
            try {
                Thread.sleep(1000);
                System.out.println("Thread 2 : "+ i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread1 = new Thread(runner1);

        Thread thread2 = new Thread(runner2);

        thread1.start();
        thread2.start();
    }
}
