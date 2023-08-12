package com.panish.algorithm.searching.binarysearch.onedimensional;

/*
*  Source: leetcode.com
*  774. Find Smallest Letter Greater Than Target
*  Given a character array letters that is sorted in non-decreasing order(sorted in ascending order) and a character target,
*  return the smallest character in the array that is larger than target.
*
* */
public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {

        case1();
        case2();
    }

    private static void case1() {
        char[] letters = {'c', 'f', 'i', 'j', 'm', 'p', 'w', 'y'};
        char target = 'i';
        System.out.println(findSmallest(letters, target));
    }

    private static void case2() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(findSmallest(letters, target));
    }

    private static char findSmallest(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        // Check if tarter is greater than all element then return first element
        if (target > letters[end]) return letters[0];

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }
}
