package MultiThreadingAssignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().
public class Question9 {
    public static void main(String[] args) {
        //        ExecutorService executorService= Executors.newFixedThreadPool(3); //Only three threads created every time.
        ExecutorService executorService = Executors.newCachedThreadPool(); //Any number of threads created, in my case, 10 threads.

        for (int i = 0; i <= 10; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread: " + Thread.currentThread().getName());
                }
            });
        }
        executorService.shutdown();
    }
}

