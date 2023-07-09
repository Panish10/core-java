package com.panish.sorting;

/*
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the 
 * adjacent elements if they are in wrong order.
 * Bubble the large element at the end of the array
 * */
public class BubbleSort {
	
	private static int count = 0;  
	public static void main(String[] args) {
		int[] ary = {6,3,10,1,4,2,5,9,8,7};
		BubbleSort obj = new BubbleSort();
		obj.practice2(ary);
		obj.print(ary);
	}
	
	public void practice2(int[] ary) {
		int temp = 0;
		for(int i=0; i<ary.length-1; i++) {
			boolean swap = false;
			for(int j=0; j<ary.length-1-i; j++) {
				count++;
				if(ary[j] > ary[j+1]) {
					temp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp;
					swap = true;
				}
			}
			if(!swap) break;
		}
	} 
	
	public void practice1(int[] arry) {
		
		int temp = 0;
		
		for(int i=0; i<arry.length-1; i++) {
			
			int flag = 0;
			
			/*
			 * j<arry.length-1-i last minus i is used as no need to swap if the last element are
			 * already sorted
			 * */  
			for(int j=0; j<arry.length-1-i; j++) {
				if(arry[j] > arry[j+1]) {
					temp = arry[j];
					arry[j] = arry[j+1];
					arry[j+1] = temp;
					flag = 1;
				}
			}
			// Check if element are not swap even once that means array is already sorted
			if(flag == 0) 
				break;
		}
		
	}
	
	private void print(int[] ary) {
		
		System.out.println("***** Sorted array *****");
		for(int i=0; i<ary.length; i++) {
			System.out.println(ary[i]);
		}
		System.out.println("No of iteration: "+count);
		count = 0;
	}
}