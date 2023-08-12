package com.panish.algorithm.sorting;

public class InsertionSortRecursive {
	public static void main(String[] args) {
		int[] arry = {6,3,10,1,4,2,5,9,8,7};
		
		for(int i=1; i<arry.length; i++) {
			moveElement(arry, arry[i], i-1);
		}
			
		System.out.println("***** Sorted array *****");
		for(int i=0; i<arry.length; i++) {
			System.out.println(arry[i]);
		}
	}
	
	public static void moveElement(int[] arry, int temp, int pos) {
		
		if(pos <= 0) {
			return;
		}
		
		if(pos>=0 && temp<arry[pos]) {
			arry[pos+1] = arry[pos];
			pos--;
		} else {
			arry[++pos] = temp;
		}
		
		//moveElement()
	}
}