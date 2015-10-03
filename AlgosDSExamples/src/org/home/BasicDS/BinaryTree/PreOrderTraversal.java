package org.home.BasicDS.BinaryTree;

import org.home.BasicDS.BinaryTreeNode;
import org.home.BasicDS.Stack;

public class PreOrderTraversal {
	
	public static void main(String[] args) {
		BinaryTreeNode root = TreeUtils.constructStandardBinaryTree();
		System.out.print("Pre order: ");

		PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
		
		preOrderTraversal.preOrder(root);
		System.out.print("\nPre order iteration: ");
		preOrderTraversal.preOrderIteration(root);
	}
	
	public void preOrder(BinaryTreeNode root){
		if(root == null){
			return;
		}

		System.out.print(root.getValue()+", ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	public void preOrderIteration(BinaryTreeNode root){
		
		Stack stack = new Stack();
		stack.push(root);
		
		while(true){
			
			while(root != null){
				System.out.print(root.getValue()+ ", ");
				stack.push(root);
				root = root .getLeft();
			}
			
			if(stack.isEmpty()){
				break;
			}
			root = (BinaryTreeNode) stack.pop();
			root = root.getRight();
		}
		
	}


}
