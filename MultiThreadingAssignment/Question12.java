package MultiThreadingAssignment;

import java.util.concurrent.atomic.AtomicInteger;

//Use Atomic Classes instead of Synchronize method and blocks.
public class Question12 {
    AtomicInteger counter = new AtomicInteger(); //atomic class to make counter synchronised

    public int method() {
        return counter.incrementAndGet(); //method instead of ++ operator
    }

    public static void main(String[] args) throws InterruptedException {
        Question10 q10 = new Question10();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    q10.method();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    q10.method();

                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    q10.method();

                }
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    q10.method();

                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        //atomic counter was accessed by one thread at a time, hence synchronised
        System.out.println(q10.counter); //without synchronised, value was variable everytime i.e., 31726, 36514,etc.
    }

}
