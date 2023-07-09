package com.panish.datastructure;

public class PCLinedList {
	
	private Node tail;
	
	private class Node {
		private String data;
		private Node next;
		
		public Node(String data) {
			this.data = data;
		}
	}
	
	public void display() {
		if(tail == null) {
			System.out.println("null");
			return;
		}
		Node temp = tail.next;
		while(temp != tail) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print(temp.data+"->");
		System.out.println();
	}
	
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(tail == null) {
			tail = newNode;
			newNode.next = tail;
		} else {
			Node head = tail.next;
			tail.next = newNode;
			newNode.next = head;
		}
	}
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(tail == null) {
			tail = newNode;
			newNode.next = tail;
		} else {
			Node head = tail.next;
			tail.next = newNode;
			newNode.next = head;
			tail = newNode;
		}
	}
	
	public String removeFirst() {
		if(tail == null) return null;
		
		String result = tail.next.data;
		if(tail == tail.next) {
			tail = null;
		} else {
			tail.next = tail.next.next;	
		}
		return result;
	}
	  
	public String removeLast() { if(tail == null) return null;
		if(tail == null) return null;
		
		String result = tail.data;
		if(tail == tail.next) {
			tail = null;
		} else {
			Node current = tail;
			while(current.next != tail) {
				current = current.next;
			}
			current.next = tail.next;
			tail = current;
		}
		return result;
	}
	 
}
