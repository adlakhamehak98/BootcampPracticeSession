package MultiThreadingAssignment;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().
 /** NOTE: signalAll() cannot be done with 2 threads so this is implementation of await and signal,
  * for signalAll() and await() please check Question15A class**/
public class Question15 {
    Lock lock = new ReentrantLock(true);
    Condition condition = lock.newCondition();

    public void method1() {
        try {
            lock.lock();
            System.out.println("method 1 Started");
            condition.await(); //process interrupted
            System.out.println("method 1 Finished after signal");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); //lock released for next thread
        }

    }

    public void method2() {
        try{
            lock.lock();
            System.out.println("method 2 Started");
            System.out.println("method 2 Finished");
            condition.signal(); //thread 1 resumes
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
     Question15 question15 = new Question15();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                question15.method1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                question15.method2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
