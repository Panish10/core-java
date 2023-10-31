package com.panish.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class JavaCallableExample {

    public static void main(String[] args) throws Exception {

        // FutureTask is the concrete class
        // Create an array of 10 objects of the FutureTask class
        FutureTask[] randomNoTasks = new FutureTask[10];

        // loop for spawning 10 threads
        for (int i = 0; i < 10; i++) {

            // Creating a new object of JavaCallable class
            Callable callable = new JavaCallable();

            // Creating the FutureTask with Callable
            randomNoTasks[i] = new FutureTask(callable);

            // Since FutureTask implement Runnable, we can create a Thread with FutureTask
            Thread thread = new Thread(randomNoTasks[i]);
            thread.start();
        }

        // loop for receiving random numbers
        for (int i = 0; i < 10; i++) {

            // invoking the get() method
            Object o = randomNoTasks[i].get();

            // The get() method holds the control until the result is received
            // The get() method may through the checked exception

            // printing the generated random number
            System.out.println("The random number is: " + o);
        }
    }
}
