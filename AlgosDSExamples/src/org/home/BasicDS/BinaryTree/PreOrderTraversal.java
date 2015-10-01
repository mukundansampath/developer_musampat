package org.home.BasicDS.BinaryTree;

import org.home.BasicDS.BinaryTreeNode;

public class PreOrderTraversal {
	
	public static void main(String[] args) {
		BinaryTreeNode root = TreeUtils.constructStandardBinaryTree();
		System.out.print("Pre order: ");
		new PreOrderTraversal().preOrder(root);
	}
	
	public void preOrder(BinaryTreeNode root){
		if(root == null){
			return;
		}

		System.out.print(root.getValue()+", ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}


}
