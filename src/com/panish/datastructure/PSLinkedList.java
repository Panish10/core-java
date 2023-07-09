package com.datastructure;

import java.util.Stack;

public class PSLinkedList {
	private ListNode head;

	private class ListNode {
		private int val;
		private ListNode next;
		
		public ListNode(int val) {
			this.val = val;
		}
	}
	
	public void display() {
		if(head == null) return;
		
		ListNode current = head;
		
		while(current != null) {
			System.out.print(current.val+"->");
			current = current.next;
		}
		System.out.println();
	}
	
	public void add(int val) {
		ListNode newNode = new ListNode(val);
		if(head == null) {
			head = newNode;
		} else {
			ListNode current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void createLoop() {
		
		// 1->2->3->4->5->6->3
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		ListNode six = new ListNode(6);
		
		head = one;
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = three;
	}
	
	public boolean isLoop() {
		
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			
			if(slowPtr == fastPtr) {
				return true;
			}	
		}
		return false;
	}
	
	public int loopElement() {
		
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			
			if(slowPtr == fastPtr) {
				return getElement(slowPtr);
			}
		}
		
		return 0;
	}
	
	private int getElement(ListNode slowPtr) {
		ListNode temp = head;
		
		while(temp != slowPtr) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		
		return slowPtr.val;
	}
	
	public void removeLoop() {
		if(head == null) return;
		
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				ListNode temp = head;
				
				while(temp.next != slow.next) {
					temp = temp.next;
					slow = slow.next;
				}
				
				slow.next = null;
				return;
			}
		}
	}
	
	public void reverse() {
		
		// 1-2->3->4
		ListNode current = head;
		ListNode newHead = null;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = newHead;
			newHead = current;			
			current = next;
		}
		
		head = newHead;
	}
	
	public void reversUsingStack() {
		if(head == null) return;
		Stack<ListNode> stack = new Stack<ListNode>();
		
		ListNode current = head;
		while(current != null) {
			stack.push(current);
			current = current.next;
		}
		
		head  = stack.pop();
		current = head;
		ListNode temp = null; 
		while(!stack.empty()) {
			temp = stack.pop();
			current.next = temp;
			current = temp;
		}
		
		current.next = null;
	}
	
	public void sort() {
		
		// 4->6->2->1->5->3->
		if(head == null) return;
		
		ListNode first = head;
		ListNode second = null;
		int temp = 0;
		
		while(first != null) {
			second = first.next;
			while(second != null) {
				if(first.val > second.val) {
					temp = first.val;
					first.val = second.val;
					second.val = temp;
				}
				second = second.next;
			}
			first = first.next;
		}
	}
	
	public int getMiddle() {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.val;
	}
	
	public boolean isPalindrome() {
		
		// 1 2 1
		if(head == null) return false;
		if(head.next == null) return true;
		
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			stack.push(slow);
			slow = slow.next;
			fast = fast.next.next;
		}
		  
		if(fast != null) { 
			slow = slow.next;
		} 
		
		while(slow != null && !stack.empty()) {
			if(slow.val != stack.pop().val) return false;
			slow = slow.next;
		}
		return true;
	}
}
