package main.java.com.panish.thread.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SubmitWithCallableEx {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        List<Future<String>> futureList = new ArrayList<>();
        for (int hour = 1; hour <= 4; hour++) {
            futureList.add(executorService.submit(new TaskServiceCallable(hour)));
        }
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.MINUTES);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        String message = "records archived in " + executionTime + " ms";
        System.out.println(message);
    }
}
