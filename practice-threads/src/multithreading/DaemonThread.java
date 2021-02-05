package multithreading;

public class DaemonThread {

    public static void startDaemonThread() {
        Runnable daemonRunner = () -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Daemon thread is running ...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread daemonThread = new Thread(daemonRunner);
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
