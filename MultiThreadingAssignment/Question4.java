package MultiThreadingAssignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Try shutdown() and shutdownNow() and observe the difference.
public class Question4 {
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
                        Thread.sleep(3000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 3");
                }
            });

        } finally {
            //executorService.shutdownNow(); //terminates thread 3 and gives true
            executorService.shutdown();  //doesnt terminate thread 3 and gives true
        }
        System.out.println(executorService.isShutdown());
    }
}
