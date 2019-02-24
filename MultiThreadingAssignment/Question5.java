package MultiThreadingAssignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Use isShutDown() and isTerminate() with ExecutorService.
public class Question5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 3");
                }
            });

        } finally {
            executorService.shutdown();
        }
        System.out.println(executorService.isShutdown()); //gives true since shutDown() is called
        System.out.println(executorService.isTerminated()); //thread 3 was still running so returned false
    }
}
