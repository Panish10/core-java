package main.java.com.panish.thread.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SubmitWithRunnableEx {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<Future<String>> futureList = new ArrayList<>();
        for (int hour = 1; hour <= 10; hour++) {
            futureList.add((Future<String>) executorService.submit(new TaskServiceRunnable(hour)));
        }
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.MINUTES);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        String message = "records archived in " + executionTime + " ms";
        System.out.println(message);
    }
}
