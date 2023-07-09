package com.algorithm.sorting;

/*
 *  Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, 
 *  calls itself for the two halves, and then merges the two sorted halves. 
 *  The merge() function is used for merging two halves. 
 *  The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] 
 *  are sorted and merges the two sorted sub-arrays into one. 
 * */
public class MergeSort {
	
	int[] temp;
	
	public static void main(String[] args) {
		int[] ary = {6,3,10,1,4,2,5,9,8,7};
		
		MergeSort obj = new MergeSort();
		obj.print(ary);
		obj.sortAry(ary);
		obj.print(ary);
	}
	
	public void sortAry(int[] ary) {
		temp = new int[ary.length];
		divide(ary, 0, ary.length-1);
	}
	
	public void divide(int[] ary, int start, int end) {
		
		if(start < end) {
			int mid = (start + end)/2;
			divide(ary, start, mid);
			divide(ary, mid+1, end);
			merge(ary, start, mid, end);
		}
	}
	
	public void merge(int[] ary, int start, int mid, int end) {
		
		//System.arraycopy(ary, start, temp, start, ary.length-1);
		for(int i=0; i< ary.length; i++) {
			temp[i] = ary[i];
		}
		
		int i = start;
		int j = mid+1;
		int k = start;
		
		while(i <= mid && j <= end) {
			if(temp[i] <= temp[j]) {
				ary[k] = temp[i];
				i++;
			} else {
				ary[k] = temp[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid) {
			ary[k] = temp[i];
			k++; i++;
		}
		
		while(j<=end) {
			ary[k] = temp[j];
			k++; j++;
		}
	}
	
	public void print(int[] ary) {
		for(int i=0; i< ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();
	}
}
