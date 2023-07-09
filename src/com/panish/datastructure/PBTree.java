package com.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PBTree {
	private Node root;
	
	private class Node {
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void createBinaryTree() {
		/*
		 *          1
		 *       2    3 
		 *      4 5  6 7
		 * */
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		
		root = n1;
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
	}
	
	// Traverse recursive
	public void preOrderRecursive() {
		preOrder(root);
		System.out.println();
	}
	
	private void preOrder(Node root) {
		if(root == null) return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	// Traverse iterative
	public void preOrderIterative() {
		if(root == null) return;
		
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			Node temp = stack.pop();
			System.out.print(temp.data+" ");
			if(temp.right != null)
				stack.push(temp.right);
			if(temp.left != null)
				stack.push(temp.left);
		}
		System.out.println();
	}
	
	// Traverse recursive
	public void inOrderRecursive() {
		inOrder(root);
		System.out.println();
	}
	
	private void inOrder(Node root) {
		if(root == null) return;

		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	// Traverse iterative
	public void inOrderIterative() {
		if(root == null) return;
		
		Stack<Node> stack = new Stack<Node>();
		Node temp = root;
	
		while(!stack.isEmpty() || temp != null) {
			if(temp != null) {
				stack.push(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.print(temp.data+" ");
				temp = temp.right;
			}
		}
		System.out.println();
	}
	
	// Traverse recursive
	public void postOrderRecursive() {
		postOrder(root);
		System.out.println();
	}
	
	private void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	// Traverse iterative
	public void postOrderIterative() {
		if(root == null) return;
		Stack<Node> stack = new Stack<Node>();
		Node temp = root;
		
		while(!stack.isEmpty() || temp != null) {
			if(temp != null) {
				stack.push(temp);
				stack.push(temp.right);
				stack.push(temp.left);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.print(temp.data+" ");
			}
		}
		System.out.println();
	}
	
	// Traverse iterative
	public void levelOrderIterative() {
		if(root == null) return;
		Node temp = root;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(temp);
		
		while(!queue.isEmpty()) {
			temp = queue.poll();
			System.out.print(temp.data+" ");
			if(temp.left != null) 
				queue.add(temp.left);
			if(temp.right != null)
				queue.add(temp.right);
		}
		System.out.println();
	}
	
	public void reverse() {
		if(root == null) return;
		
		this.swap(root);
	}
	
	private void swap(Node current) {
		
		if(current == null) return;
		
		Node temp = null;
		temp = current.left;
		current.left = current.right;
		current.right = temp;
		
		swap(current.left);
		swap(current.right);
	}
	
	/**
	 *  *   Binary search tree
	 *           20
	 *       10     30
	 *     5   15 25  35
	 **/
	/*
	 * public void addToBinarySearchTree(int data) {
	 * 
	 * Node node = new Node(data);
	 * 
	 * if(root == null) { root = node; return; } addToBinarySearchTree(root, data);
	 * }
	 * 
	 * private Node addToBinarySearchTree(Node root, int data) {
	 * 
	 * if(root == null) { return root; }
	 * 
	 * if(data < root.data && root.left == null) { root.left = new Node(data); }
	 * if(data > root.data && root.right == null) { root.right = new Node(data); }
	 * if(data < root.data && root.left != null) { addToBinarySearchTree(root.left,
	 * data); } if(data > root.data && root.right != null) {
	 * addToBinarySearchTree(root.right, data); } return root; }
	 */
	
	public void addToBinarySearchTree(int data) {
		root = addToBinarySearchTree(root, data);
	}
	
	private Node addToBinarySearchTree(Node root, int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		
		if(data < root.data)
			root.left = addToBinarySearchTree(root.left, data);
		if(data > root.data)
			root.right = addToBinarySearchTree(root.right, data);
		
		return root;
	}
}
