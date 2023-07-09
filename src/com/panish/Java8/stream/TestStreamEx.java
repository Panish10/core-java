package com.panish.Java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamEx {
	public static void main(String[] args) {
		List<Integer> liOfInt = Arrays.asList(2,5,6,4,3,8,6,5,4,8);
		
		long count = liOfInt.stream().count();
		System.out.print(count);
		
		System.out.println("");		
		liOfInt.forEach(System.out::print);

		System.out.println("");
		liOfInt.stream()
				.filter(n -> n>4)
				.forEach(System.out::print);
		
		System.out.println("");
		List<Integer> li2 =liOfInt.stream()
				.filter(n -> n>4)
				.collect(Collectors.toList());
		
		li2.forEach(System.out::print);
	}
}