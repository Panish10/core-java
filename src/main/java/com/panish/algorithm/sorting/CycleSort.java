package com.panish.algorithm.sorting;

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {

        int[] inputArray = {3, 5, 2, 1, 4};

        System.out.println("---- original array -----");
        printArray(inputArray);
        cycleSort(inputArray);
        System.out.println("");
        System.out.println("---- sorted array -----");
        printArray(inputArray);
    }

    private static void cycleSort(int[] inputArray) {

        int index = 0;
        while (index < inputArray.length){
            if (inputArray[index] != index + 1) {
                swap(inputArray, index, inputArray[index] - 1);
            } else {
                index++;
            }
        }
    }

    private static void swap(int[] inputArray, int index1, int index2) {
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(item -> System.out.print(item + " "));
    }
}
