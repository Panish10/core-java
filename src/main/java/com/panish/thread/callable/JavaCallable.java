package com.panish.thread.callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class JavaCallable implements Callable {
    @Override
    public Object call() throws Exception {

        // Create an object of the Random class
        Random random = new Random();

        // Generate a random number between 0 to 9
        Integer randNo = random.nextInt(10);

        // The thread is delayed for random time
        Thread.sleep( randNo * 1000);

        return randNo;
    }
}
