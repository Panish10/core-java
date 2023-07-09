package com.panish.sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort1 {

    public static void main(String[] args) {

        int arraySize = 10000000;
        int boundary  = 10000;
        int[] inputArray = new int[arraySize];
        Random random = new Random();
        for(int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(boundary);
        }

        System.out.println("---- original array -----");
        printArray(inputArray);
        mergeSort(inputArray);
        System.out.println("");
        System.out.println("---- sorted array -----");
        printArray(inputArray);
    }

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) return;

        int mid = inputLength / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[inputLength - mid];

        for( int i = 0; i < mid; i++)
            leftHalf[i] = inputArray[i];

        for ( int j = mid; j < inputLength; j++)
            rightHalf[j-mid] = inputArray[j];


        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {

        int i = 0, j = 0, k = 0;

        while (i < leftHalf.length && j < rightHalf.length) {
            if(leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++; k++;
            } else {
                inputArray[k] = rightHalf[j];
                j++; k++;
            }
        }

        while (i < leftHalf.length) {
            inputArray[k] = leftHalf[i];
            i++; k++;
        }

        while (j < rightHalf.length) {
            inputArray[k] = rightHalf[j];
            j++; k++;
        }
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(item -> System.out.print(item+" "));
    }
}
