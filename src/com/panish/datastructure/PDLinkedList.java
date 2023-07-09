package com.datastructure;

public class PDLinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	private class Node {
		private Node previous;
		private Node next;
		private String data;
		
		public Node(String data) {
			this.data = data;
		}
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void insertFirst(String data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			tail = newNode;
		} else {
			newNode.next = head;
			head.previous = newNode;
		}
		
		head = newNode;
		length++;
	}
	
	public void insertLast(String data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		
		tail = newNode;
		length++;
	}
	
	public void displayForward() {
		if(head == null) return;
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		if(tail == null) return;
		Node temp = tail;
		
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.previous;
		}
		System.out.println();
	}
	
	public String deleteFirst() {
		if(isEmpty()) return null;
		
		Node temp  = head;
		String result = head.data;
		if(length == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.previous = null;	
		}
		length--;
		return result;
	}
	
	public String deleteLast() {
		if(isEmpty()) return null;
		
		Node temp = tail;
		String result = tail.data;
		
		if(length == 1) {
			head = null;
			tail = null;
		} else {
			tail = tail.previous;
			tail.next = null;
		}
		length--;
		return result;
	}
}
