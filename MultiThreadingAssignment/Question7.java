package MultiThreadingAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

//Submit List of tasks to ExecutorService and wait for the completion of all the tasks.
public class Question7 {
    public static void main(String[] args) {
        List<Callable<Integer>> list = new ArrayList();
        list.add(new Callable<Integer>() {
            @Override
            public Integer call() {
                return 1;
            }
        });

        list.add(new Callable<Integer>() {
            @Override
            public Integer call() {
                return 2;
            }
        });

        list.add(new Callable<Integer>() {
            @Override
            public Integer call() {
                return 3;
            }
        });
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        try {
            List<Future<Integer>> futureList = executorService.invokeAll(list);
            for (Future e : futureList) {
                if (e.isDone()) {
                    try {
                        System.out.println("" + e.get());
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    } catch (ExecutionException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
