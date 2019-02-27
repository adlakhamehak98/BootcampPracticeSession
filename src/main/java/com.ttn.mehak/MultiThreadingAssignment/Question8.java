package main.java.com.ttn.mehak.MultiThreadingAssignment;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay().
public class Question8 {
    public static void main(String[] args) {
        //schedule()
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Thread 1");
                    }
                }, 1, TimeUnit.SECONDS);
        executorService.shutdown();

        //scheduleAtFixedRate()
        ScheduledExecutorService executorService1 = Executors.newSingleThreadScheduledExecutor();
        executorService1.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2");
            }
        }, 1, 1, TimeUnit.SECONDS);


        ScheduledExecutorService executorService2 = Executors.newSingleThreadScheduledExecutor();
        executorService2.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3");
            }
        }, 1, 1, TimeUnit.SECONDS);

    }
}