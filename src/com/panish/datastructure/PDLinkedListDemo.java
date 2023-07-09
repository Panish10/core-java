package com.datastructure;

public class PDLinkedListDemo {
	public static void main(String[] args) {
		PDLinkedList list = new PDLinkedList();
		list.insertLast("6");
		//list.insertLast("8");
		//list.insertFirst("2");
		//System.out.println(list.deleteFirst());
		System.out.println(list.deleteLast());
		list.displayForward();
		System.out.println(list.deleteLast());
		//list.displayBackward();
	}
}
