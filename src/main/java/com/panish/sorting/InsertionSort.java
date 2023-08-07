package com.panish.sorting;

/*
 * Insertion sort is a simple sorting algorithm that works similar to the way you sort 
 * playing cards in your hands. The array is virtually split into a sorted and an unsorted part. 
 * Values from the unsorted part are picked and placed at the correct position in the sorted part.
 * */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arry = {6,3,10,1,4,2,5,9,8,7};
		InsertionSort obj = new InsertionSort();
		obj.print(arry);
		obj.practice2(arry);
		System.out.println("***** Sorted array *****");
		obj.print(arry);
	}
	
	private void practice2(int[] ary) {
		for(int i=1; i<ary.length; i++) {
			int temp = ary[i];
			int j = i-1;
			
			while( j >= 0 && temp < ary[j] ) {
				ary[j+1] = ary[j];
				j--;
			}
			ary[++j] = temp;
		}
	}
	
	private void practice1 (int[] arry) {
		
		for(int i=1; i<arry.length; i++) {
			int temp = arry[i];
			int j = i-1;
			while(j>=0 && temp < arry[j]) {
				arry[j+1] = arry[j];
				j--;
			}
			arry[++j] = temp;
		}
	}
	
	private void print(int[] arry) {
		for(int i=0; i<arry.length; i++) {
			System.out.print(arry[i]+" ");
		}
		System.out.println();
	}
}