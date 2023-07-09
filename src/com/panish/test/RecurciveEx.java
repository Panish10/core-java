package com.test;

public class RecurciveEx {
	public static void main(String[] args) {
		int[] ary = {6,3,10,1,4,2,5,9,8,7};
		RecurciveEx obj = new RecurciveEx();
		obj.printTest(ary, ary.length-1);
	}
	
	public void printTest(int[] ary, int i) {
		if(i < 0) {
			return;
		}
		System.out.print(ary[i]+" ");
		--i;
		printTest(ary, i);
	}
}
