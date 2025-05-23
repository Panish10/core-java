package com.panish.interview;

import java.util.Arrays;
import java.util.Random;

/*
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the
 * adjacent elements if they are in wrong order.
 * Bubble the large element at the end of the array
 * */
public class BubbleSort {

    public static void main(String[] args) {

        int[] inputArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(100);
        }
        //int[] inputArray = {12, 25, 2, 4, 5 ,9, 10, 13, 15 , 17, 21};

        System.out.println("----- original array -----");
        printArray(inputArray);

        bubbleSort(inputArray);

        System.out.println("");
        System.out.println("----- sorted array -----");
        printArray(inputArray);
    }

    private static void bubbleSort(int[] inputArray) {

        boolean swapped;
        for (int i = 0; i < inputArray.length - 1 - i; i++) {
            swapped = false;
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
