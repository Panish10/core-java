package com.panish.algorithm.sorting;

import java.util.Arrays;
import java.util.Random;

/*
 * Insertion sorting is a simple sorting algorithm that works similar to the way you sorting
 * playing cards in your hands. The array is virtually split into a sorted and an unsorted part.
 * Values from the unsorted part are picked and placed at the correct position in the sorted part.
 * */
public class InsertionSort {

    public static void main(String[] args) {

        int[] inputArray = new int[10];
        Random random = new Random();
        for (int i = 0; i< inputArray.length; i++) {
            inputArray[i] = random.nextInt(100);
        }

        System.out.println("----- original array -----");
        printArray(inputArray);

        insertionSort(inputArray);
        System.out.println("");
        System.out.println("----- sorted array -----");
        printArray(inputArray);
    }

    private static void insertionSort(int[] inputArray) {

        // 2 5 4 6 1
        int currentValue = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int currentIndex  = i+1;
            currentValue = inputArray[currentIndex];

            while ( currentIndex > 0 && currentValue < inputArray[currentIndex-1]) {
                inputArray[currentIndex] = inputArray[currentIndex - 1];
                currentIndex--;
            }
            inputArray[currentIndex] = currentValue;
        }
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach( item -> System.out.print(item + " "));
    }
}
