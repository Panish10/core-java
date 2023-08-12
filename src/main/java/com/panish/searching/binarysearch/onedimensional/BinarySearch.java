package com.panish.searching.binarysearch.onedimensional;

/*
* Binary search is always work on sorted array
* */
public class BinarySearch {
	
	public static void main(String[] args) {
		int[] ary = {2, 4, 5 ,9, 10, 10, 10, 12, 12, 13, 15 , 17, 21, 25};
		
		BinarySearch obj = new BinarySearch();

		int element = 10;
		System.out.println("Index of "+element+" is: "+obj.find(ary,ary.length,element));
		System.out.println("First of "+element+" is: "+obj.findFirst(ary,ary.length,element));
		System.out.println("Last of "+element+" is: "+obj.findLast(ary,ary.length,element));
		System.out.println("Count of "+element+" is: "+obj.countOfElement(ary,ary.length,element));
	}
	
	// find element at any position
	private int find(int[] ary, int length, int element) {
		int low = 0;
		int high = length-1;
		
		while(low <= high) {
			int mid = (low + high)/2;
			if(element == ary[mid]) return mid;
			if(element < ary[mid]) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		
		return -1;
	}
	
	// Find fist position
	private int findFirst(int[] ary, int length, int element) {
		
		int low = 0;
		int high = length-1;
		int result = -1;
		
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(element == ary[mid]) result = mid;
			if(element <= ary[mid]) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return result;
	}
	
	// Find last position
	private int findLast(int[] ary, int length, int element) {
		
		int low = 0;
		int high = length-1;
		int result = -1;
		
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(element == ary[mid]) result = mid;
			if(element < ary[mid]) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return result;
	}
	
	// Find the number of times element occurred in list 
	private int countOfElement(int[] ary, int length, int element ) {
		int firstIndex = -1;
		int lastIndex = -1;
		int low = 0;
		int high = length-1;
		
		while(low <=high) {
			int mid = low + (high-low)/2;
			
			if(element == ary[mid]) firstIndex = mid;
			
			if(element <= ary[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		low = 0;
		high = length-1;
		
		while(low <=high) {
			int mid = low + (high-low)/2;
			
			if(element == ary[mid]) lastIndex = mid;
			
			if(element < ary[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		if(firstIndex >=0 && lastIndex >=0)
			return (lastIndex - firstIndex) + 1;
		return 0;
	}
	
}