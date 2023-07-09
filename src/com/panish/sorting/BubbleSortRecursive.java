package com.algorithm.sorting;

public class BubbleSortRecursive {

	public static void main(String[] arts) {
		int[] arry = {6,3,10,1,4,2,5,9,8,7};
		for(int i=0; i<arry.length -1; i++) {
			swap(0, arry.length, arry);
		}
		
		System.out.println("***** Sorted array *****");
		for(int i=0; i<arry.length; i++) {
			System.out.println(arry[i]);
		}
	}
	
	public static void swap(int index, int length, int[] arry) {
		if(index == length-1) {
			return;
		}
		int temp = 0;

		if(arry[index] > arry[index+1]) {
			temp = arry[index];
			arry[index] = arry[index+1];
			arry[index+1] = temp;
		}
		
		swap(++index, length, arry);
	}
}