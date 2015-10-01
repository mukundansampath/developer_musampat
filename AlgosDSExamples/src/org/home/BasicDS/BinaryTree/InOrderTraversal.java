package org.home.BasicDS.BinaryTree;

import org.home.BasicDS.BinaryTreeNode;
import org.home.BasicDS.Stack;

public class InOrderTraversal {
	
	public static void main(String[] args) {
		BinaryTreeNode root = TreeUtils.constructStandardBinaryTree();
		InOrderTraversal inOrderTraversal = new InOrderTraversal();
		
		System.out.print("In order: ");
		inOrderTraversal.inOrder(root);
		System.out.print("\nIn order recursion: ");
		inOrderTraversal.inOrderIteration(root);
	}
	
	public void inOrder(BinaryTreeNode root){
		if(root == null){
			return;
		}
		
		inOrder(root.getLeft());
		System.out.print(root.getValue()+", ");
		inOrder(root.getRight());
	}

	public void inOrderIteration(BinaryTreeNode root){
		
		Stack stack = new Stack();
		
		while(true){

			while(root != null){
				stack.push(root);
				root = root.getLeft();
			}
			
			if(stack.isEmpty()){
				break;
			}
			
			root = (BinaryTreeNode) stack.pop();
			System.out.print(root.getValue()+", ");
			root = root.getRight();
			
		}
	}

}
