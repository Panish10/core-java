package com.panish.algorithm.searching.binarysearch.onedimensional;

/**
 * Find the Ceiling of target Number i.e. find the smallest element which is greater then or equal to target element
 */

public class CeilingOfTargetNumber {

    public static void main(String[] args) {
        case1();
        case2();
    }

    private static void case1() {
        int[] ary = {2, 4, 5 ,9, 10, 10, 10, 12, 12, 13, 15 , 17, 21, 25};
        int target = 3;
        System.out.println(getCeiling(ary, target));
    }

    private static void case2() {
        int[] ary = {2, 3, 5, 9, 14, 16, 18};
        int target = 3;
        System.out.println(getCeiling(ary, target));
    }

    private static int getCeiling(int[] ary, int target) {

        int start = 0;
        int end = ary.length - 1;

        // Check if target is greater than all element
        if (target > ary[end]) return -1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target == ary[mid]) return ary[mid];
            if (target < ary[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ary[start];
    }
}
