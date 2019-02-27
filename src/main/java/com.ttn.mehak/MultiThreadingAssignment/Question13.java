package main.java.com.ttn.mehak.MultiThreadingAssignment;

//Coordinate 2 threads using wait() and notify().
public class Question13 {
    public void thread1() {
        synchronized (this) {
            System.out.println("Thread 1 Started");
            try {
                wait(); // thread finishes when other thread sends notify()
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 Finished");
        }
    }

    public void thread2() {
        synchronized (this) {
            System.out.println("Thread 2 Started");
            System.out.println("Thread 2 Finished");
            notify(); //thread 1 resumes
        }
    }

    public static void main(String[] args) {
        Question13 question13 = new Question13();
        new Thread(new Runnable() {
            @Override
            public void run() {
                question13.thread1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                question13.thread2();
            }
        }).start();
    }
}
