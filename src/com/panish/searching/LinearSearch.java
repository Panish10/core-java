package com.algorithm.searching;

public class LinearSearch {
	
	private static int count;
	public static void main(String[] args) {
		int[] ary = prepareData();
		
		LinearSearch obj = new LinearSearch();
		int index = obj.find(ary,ary.length,100);
		System.out.println(index);
		System.out.println("Iteration: "+count); count = 0;
	}
	
	private int find(int[] ary, int length, int element) {
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
