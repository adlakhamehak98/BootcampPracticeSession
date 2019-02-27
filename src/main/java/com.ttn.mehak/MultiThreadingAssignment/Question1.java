package main.java.com.ttn.mehak.MultiThreadingAssignment;
//Create and Run a Thread using Runnable Interface and Thread class.

class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Running Runnable Thread Demo");
    }
}

class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Running Thread Demo");
    }
}

public class Question1 {
    public static void main(String[] args) {
        new Thread(new RunnableDemo()).start();
        new ThreadDemo().start();
    }
}

