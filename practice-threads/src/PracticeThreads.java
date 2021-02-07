import multithreading.*;

public class PracticeThreads {

    public static void main(String[] args) {
//        ThreadSleep.practiceThreadSleep();
//        DaemonThread.startDaemonThread();
//        WorkerThread.startWorkerThread();
//        Synchronization synchronization = new Synchronization();
//        synchronization.process();

        WaitNotify waitNotify = new WaitNotify();
        waitNotify.process();
    }
}
