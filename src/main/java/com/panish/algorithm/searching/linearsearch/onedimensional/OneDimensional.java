package com.panish.algorithm.searching.linearsearch.onedimensional;

/*
* Search the element in array
* */
public class OneDimensional {
	
	private static int count;
	public static void main(String[] args) {
		int[] ary = prepareData();

		int index = find(ary,ary.length,77);
		System.out.println(index);
		System.out.println("Iteration: "+count); count = 0;
	}
	
	private static int find(int[] ary, int length, int element) {
		for(int i=0; i<length; i++) {
			count++;
			if(ary[i] == element) return i;
		}
		return -1;
	}
	
	private static int[] prepareData() {
		int[] ary = new int[100];
		for(int i=0; i<ary.length; i++) {
			ary[i] = i+1;
		}
		return ary;
	}
}
