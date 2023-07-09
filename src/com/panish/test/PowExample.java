package com.test;

public class PowExample {

	public static void main(String[] args) {
		int x = 5;
		int n = 3;
		int result = 1;
		PowExample obj = new PowExample();
		System.out.println(obj.pow(x, n));
	}
	
	int pow(int x, int n) {
		
		if(n > 0) {
			--n;
			pow(x, n);
		}
		
		x = x * x;	
		return x;
	}
}
