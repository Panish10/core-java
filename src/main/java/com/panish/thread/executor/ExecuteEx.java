package main.java.com.panish.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuteEx {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int hour = 1; hour <= 4; hour++) {
            executorService.execute(new TaskServiceRunnable(hour));
        }
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.MINUTES);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        String message = "records archived in " + executionTime + " ms";
        System.out.println(message);
    }
}
