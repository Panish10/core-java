package com.panish.searching.linearsearch;

import java.util.Arrays;

public class TwoDimensional {

    public static void main(String[] args) {
        int[][] ary = prepareData();

        int[] ans = find(ary, 35);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] find(int[][] arr, int element) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (element == arr[row][col]) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    private static int[][] prepareData() {
        return new int[][] {
                {2, 6, 8, 10},
                {13, 15, 18},
                {19, 21},
                {25, 28, 30, 35}
        };
    }
}
