package com.panish.sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        int[] inputArray = new int[10];
        Random random = new Random();
        for(int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(100);
        }

        System.out.println("----- original array");
        printArray(inputArray);
        System.out.println("");
        selectionSort(inputArray);
        System.out.println("----- sorted array -----");
        printArray(inputArray);
    }

    private static void selectionSort(int[] inputArray) {

        int min = 0;
        int minIndex = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            min = inputArray[i];
            minIndex = i;
            for (int j = i+1; j < inputArray.length; j++) {
                if (inputArray[minIndex] > inputArray[j]) {
                    minIndex = j;
                }
            }

            swap(inputArray, i, minIndex);
        }
    }

    private static void swap(int[] inputArray, int i, int minIndex) {
        int temp = inputArray[i];
        inputArray[i] = inputArray[minIndex];
        inputArray[minIndex] = temp;
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(item -> System.out.print(item+" "));
    }
}
