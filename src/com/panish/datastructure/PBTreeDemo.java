package com.datastructure;

/*
 *          1                                 1
 *       2    3    --> after reverse       3      2
 *      4 5  6  7                        7   6   5  4
 *      
 *      Binary search tree
 *           20
 *       10     30
 *     5   15 25  35
 * */
public class PBTreeDemo {
	public static void main(String[] args) {
		PBTree tree = new PBTree();
		//tree.createBinaryTree();
		
		//tree.preOrderRecursive(); // expected result 1 2 4 5 3 6 7
		//tree.preOrderIterative(); // expected result 1 2 4 5 3 6 7
		
		//tree.inOrderRecursive(); // expected result 4 2 5 1 6 3 7
		//tree.inOrderIterative(); // expected result 4 2 5 1 6 3 7
		
		//tree.postOrderRecursive(); // expected result 4 5 2 6 7 3 1
		//tree.postOrderIterative(); // expected result 4 5 2 6 7 3 1
		
		//tree.levelOrderIterative(); // expected result 1 2 3 4 5 6 7
		
		//tree.reverse(); // after reverse expected result (level order traverse) 1 3 2 7 6 5 4
		//tree.levelOrderIterative(); // after reverse expected result 1 3 2 7 6 5 4
		
		// start- add element in binary search tree
		tree.addToBinarySearchTree(20);
		tree.addToBinarySearchTree(10);
		tree.addToBinarySearchTree(30);
		tree.addToBinarySearchTree(5);
		tree.addToBinarySearchTree(15);
		tree.addToBinarySearchTree(25);
		tree.addToBinarySearchTree(35);
		
		tree.levelOrderIterative(); // 20 10 30 5 15 25 35
		tree.inOrderIterative(); // 5 10 15 20 25 30 35 - Inorder traversal print binary search tree in sorted manner
		// end- add element in binary search tree
	}
}
