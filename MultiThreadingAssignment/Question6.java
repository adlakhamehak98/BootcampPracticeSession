package MultiThreadingAssignment;

import java.util.concurrent.*;

//Return a Future from ExecutorService by using callable and use
// get(), isDone(), isCancelled() with the Future object to know the status of task submitted.
public class Question6 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                return 1;
            }
        });
        executorService.shutdown();

        if (future.isDone()) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        } else
            System.out.println("Future not done yet");

        if (future.isCancelled())
            System.out.println("Task cancelled!");
    }
}
