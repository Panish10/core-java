package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparator implements I1 {

	public void m1() {
		System.out.println("class");
	}
	
	public static void main(String[] args) {
		
		I1 i = new MyComparator();
		I1.m1();
	}

}

interface I1 {
	static void m1() {
		System.out.println("I1");
	}
}
