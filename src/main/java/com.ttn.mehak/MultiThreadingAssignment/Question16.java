package main.java.com.ttn.mehak.MultiThreadingAssignment;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Create a deadlock and Resolve it using tryLock().
public class Question16 {
    Lock lock1 = new ReentrantLock(true);


    Lock lock2 = new ReentrantLock(true);

    public void acquireLock(Lock lock1, Lock lock2){ //trylock

        boolean acquireLock1= lock1.tryLock();
        boolean acquireLock2= lock2.tryLock(); //procedure how to acquire lock

        if(acquireLock1 && acquireLock2){
            return; //only proceed if both locks are acquired
        }

        if(acquireLock1){
            lock1.unlock();
        }

        if(acquireLock2){
            lock2.unlock();
        }

    }

    public void method1(){
        acquireLock(lock1,lock2); //call trylock
        System.out.println("lock 1 method 1");

        System.out.println("lock 2 method 1");
        lock2.unlock();
        lock1.unlock();
    }

    public void method2(){
        acquireLock(lock2,lock1); //call trylock
        System.out.println("lock 1 method 2");
        System.out.println("lock 2 method 2");
        lock1.unlock();
        lock2.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        Question16 question16 = new Question16();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                question16.method1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                question16.method2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
