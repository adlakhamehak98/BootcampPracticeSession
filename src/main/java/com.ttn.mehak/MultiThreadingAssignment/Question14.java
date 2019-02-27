package main.java.com.ttn.mehak.MultiThreadingAssignment;

//Coordinate mulitple threads using wait() and notifyAll()
public class Question14 {
    public void thread1() {
        synchronized (this) {
            System.out.println("Thread 1 Started");
            try {
                wait(); // thread finishes when other thread sends notifyAll()
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 Finished after notifyall");
        }
    }

    public void thread2() {
        synchronized (this) {
            System.out.println("Thread 2 Started");
            try {
                wait(); // thread finishes when other thread sends notifyAll()
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 Finished after notifyall");
        }
    }

    public void thread3() {
        synchronized (this) {
            System.out.println("Thread 3 Started");
            System.out.println("Thread 3 Finished");
            notifyAll(); //thread 1 and thread 2 resumes
        }
    }

    public static void main(String[] args) {
        Question14 question14 = new Question14();
        new Thread(new Runnable() {
            @Override
            public void run() {
                question14.thread1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                question14.thread2();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                question14.thread3();
            }
        }).start();
    }
}
