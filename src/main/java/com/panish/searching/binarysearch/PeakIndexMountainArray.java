package com.panish.searching.binarysearch;

/**
 * Source: leetcode.com
 * 852. Peak Index in a Mountain Array
 */
public class PeakIndexMountainArray {

    public static void main(String[] args) {
        case1();
        case2();
        case3();
    }

    private static void case1() {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    private static void case2() {
        int[] arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    private static void case3() {
        int[] arr = {0,10, 12, 11, 5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    private static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
