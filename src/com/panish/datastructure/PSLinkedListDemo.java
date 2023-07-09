package com.panish.datastructure;

public class PSLinkedListDemo {

	public static void main(String[] args) {
		
		PSLinkedList li = new PSLinkedList();
		//li.add(4); li.add(6); li.add(2); li.add(1); li.add(5); li.add(3);
		li.display();
		
		//li.createLoop(); // 1->2->3->4->5->6->3
		//System.out.println(li.isLoop());
		//System.out.println(li.loopElement());
		//li.reverse();
		//li.reversUsingStack();
		//li.removeLoop();
		//li.sort();
		//li.display();
		//System.out.println("Middle element: "+li.getMiddle());
		
		// start add below input to test palindrome 
		li.add(4);li.add(1);li.add(1);li.add(1);//li.add(1);
		
		// end add below input to test palindrome 
		li.display();
		System.out.println("isPalindrome: "+li.isPalindrome());
	}
}
