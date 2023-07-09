package com.datastructure;

public class PCLinkedListDemo {
	public static void main(String[] args) {
		PCLinedList list = new PCLinedList();
		list.addFirst("1");
		list.addFirst("2");
		//list.addLast("3");
		//list.addLast("5");
		//list.addLast("8");
		list.display();
		System.out.println("Removed element: "+list.removeFirst());
		list.display();
	}
}
