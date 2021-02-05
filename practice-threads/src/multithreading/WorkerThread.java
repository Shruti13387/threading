package multithreading;

public class WorkerThread {

    public static void startWorkerThread() {
        Runnable workerRunner = () -> {
            try {
                Thread.sleep(3000);
                System.out.println("Worker thread finished execution ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread workerThread = new Thread(workerRunner);
        workerThread.start();
    }
}
