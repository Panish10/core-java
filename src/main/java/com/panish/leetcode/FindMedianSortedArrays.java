package com.panish.leetcode;

public class FindMedianSortedArrays {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newLength = nums1.length + nums2.length;
        int[] nums3 = new int[newLength];
        int i = 0;
        int j = 0;
        int k = 0;
        int medianIndex = newLength/2;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i];
                i++;
            } else {
                nums3[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }

        if (newLength % 2 == 0) {
            return (nums3[medianIndex] + nums3[medianIndex - 1])/2.0;
        } else {
            return new Double(nums3[medianIndex]);
        }
    }

    // O(log(min(m,n))) time, O(1) space — binary search on partition
    private static double findMedianSortedArraysOptimized(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArraysOptimized(nums2, nums1);
        }
        int m = nums1.length, n = nums2.length;
        int halfLen = (m + n + 1) / 2;
        int lo = 0, hi = m;
        while (lo <= hi) {
            int partX = (lo + hi) / 2;
            int partY = halfLen - partX;
            int maxLeftX  = (partX == 0) ? Integer.MIN_VALUE : nums1[partX - 1];
            int minRightX = (partX == m) ? Integer.MAX_VALUE : nums1[partX];
            int maxLeftY  = (partY == 0) ? Integer.MIN_VALUE : nums2[partY - 1];
            int minRightY = (partY == n) ? Integer.MAX_VALUE : nums2[partY];
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeftX, maxLeftY);
                }
                return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
            } else if (maxLeftX > minRightY) {
                hi = partX - 1;
            } else {
                lo = partX + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted");
    }
}
