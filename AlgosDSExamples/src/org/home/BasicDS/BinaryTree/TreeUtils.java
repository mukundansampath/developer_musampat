package org.home.BasicDS.BinaryTree;

import org.home.BasicDS.BinaryTreeNode;

public class TreeUtils {
	
	public static BinaryTreeNode constructStandardBinaryTree() {
		
		BinaryTreeNode root = new BinaryTreeNode(0);
		BinaryTreeNode one = new BinaryTreeNode(1);
		BinaryTreeNode two = new BinaryTreeNode(2);
		BinaryTreeNode three = new BinaryTreeNode(3);
		BinaryTreeNode four = new BinaryTreeNode(4);
		BinaryTreeNode five = new BinaryTreeNode(5);
		BinaryTreeNode six = new BinaryTreeNode(6);
		
		BinaryTreeNode seven = new BinaryTreeNode(7);
		BinaryTreeNode eight = new BinaryTreeNode(8);
		BinaryTreeNode nine = new BinaryTreeNode(9);
		BinaryTreeNode ten = new BinaryTreeNode(10);
		
		BinaryTreeNode eleven = new BinaryTreeNode(11);
		BinaryTreeNode twelve = new BinaryTreeNode(12);
		BinaryTreeNode thirteen = new BinaryTreeNode(13);
		BinaryTreeNode fourteen = new BinaryTreeNode(14);
		
		root.setLeft(one);
		root.setRight(two);
		one.setLeft(three);
		one.setRight(four);
		two.setLeft(five);
		two.setRight(six);

		three.setLeft(seven);
		three.setRight(eight);
		four.setLeft(nine);
		four.setRight(ten);
		
		five.setLeft(eleven);
		five.setRight(twelve);
		six.setLeft(thirteen);
		six.setRight(fourteen);
		
		return root;
	}

}
