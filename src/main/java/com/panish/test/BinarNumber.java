package com.panish.test;

public class BinarNumber {
	public static void main(String[] args) {
		int number = 20;
		String binary = convert(number);
		System.out.println(binary);
	}
	
	private static String convert(int number) {
		String result = "";
		while(number >= 1) {
			result = result + number%2;
			number = number/2;
		}
		return result;
	}
}
