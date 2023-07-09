package com.panish.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] inputArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(100);
        }

        System.out.println("----- original array -----");
        printArray(inputArray);

        bubbleSort(inputArray);

        System.out.println("");
        System.out.println("----- sorted array -----");
        printArray(inputArray);
    }

    private static void bubbleSort(int[] inputArray) {
        boolean swapped = false;
        for (int i = 0; i < inputArray.length - 1 - i; i++) {
            for (int j = 0; j < inputArray.length -1 - i; j++) {
                if (inputArray[j] > inputArray[j+1]) {
                    swap(inputArray, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    private static void swap(int[] array, int i , int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach( item -> System.out.print(item + " "));
    }
}
