package com.algorithm.sorting;

/*
 * How does Selection Sort work?
The selection sort algorithm sorts an array by repeatedly finding the minimum element 
(considering ascending order) from unsorted part and putting it at the beginning. 
In every iteration of selection sort, the minimum element (considering ascending order) 
from the unsorted subarray is picked and moved to the sorted subarray.*/

public class SelectionSort {
	public static void main(String[] args) {
		int[] arry = {6,3,10,1,4,2,5,9,8,7};
		SelectionSort obj = new SelectionSort();
		obj.print(arry);
		obj.practice1(arry);
		obj.print(arry);
	}
	
	private void practice1(int[] ary) {
		int temp = 0;
		
		for(int i=0; i<ary.length-1; i++) {
			
			int pos = i;
			// for finding minimum element
			for(int j=i+1; j<ary.length; j++) {
				if(ary[pos] > ary[j]) {
					pos = j;
				}
			}
			
			// Swap the last element in sorted array with minimum element from unsorted array
			temp = ary[i]; 
			ary[i] = ary[pos]; 
			ary[pos] = temp;
		}
	}
	
	private void print(int[] arry) {
		for(int i=0; i<arry.length; i++) {
			System.out.print(arry[i]+" ");
		}
		System.out.println();
	}
}