import multithreading.DaemonThread;
import multithreading.ThreadSleep;
import multithreading.WorkerThread;

public class PracticeThreads {

    public static void main(String[] args) {
      //  ThreadSleep.practiceThreadSleep();
        DaemonThread.startDaemonThread();
        WorkerThread.startWorkerThread();
    }
}
