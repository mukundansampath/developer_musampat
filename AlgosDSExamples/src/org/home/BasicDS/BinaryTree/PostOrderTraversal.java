package org.home.BasicDS.BinaryTree;

import org.home.BasicDS.BinaryTreeNode;
import org.home.BasicDS.Stack;

public class PostOrderTraversal {
	
	public static void main(String[] args) {
		BinaryTreeNode root = TreeUtils.constructStandardBinaryTree();
		System.out.print("Post order: ");
		new PostOrderTraversal().postOrder(root);
	}
	

	public void postOrder(BinaryTreeNode root){
		if(root == null){
			return;
		}
		
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getValue()+", ");
	}


}
