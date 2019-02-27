package main.java.com.ttn.mehak.MultiThreadingAssignment;

//Use sleep and join methods with thread.
public class Question2 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000L); //thread sleeps for 1sec
                    System.out.println("Running 1st Thread");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000L);  //thread sleeps for 3 sec
                    System.out.println("Running 2nd Thread");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); //join to let it complete execution
        thread2.join();

        System.out.println("Process Finished"); //runs after execution of thread1 and thread2
    }
}
