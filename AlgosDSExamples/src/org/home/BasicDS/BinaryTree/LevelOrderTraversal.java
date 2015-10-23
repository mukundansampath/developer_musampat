package org.home.BasicDS.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import org.home.BasicDS.BinaryTreeNode;

public class LevelOrderTraversal {
	
	public static void main(String[] args) {
		
		BinaryTreeNode root = TreeUtils.constructStandardBinaryTree();
		new LevelOrderTraversal().levelOrderTraversal(root);
	}

	public void levelOrderTraversal(BinaryTreeNode root) {
		
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		
		System.out.println("Level Order Traversal: ");
		while(!queue.isEmpty()){
			
			BinaryTreeNode currentNode = (BinaryTreeNode)queue.poll();
			
			System.out.print(currentNode.getValue()+", ");
			
			if(currentNode.getLeft() != null){
				queue.add(currentNode.getLeft());
			}
			
			if(currentNode.getRight() != null){
				queue.add(currentNode.getRight());
			}
			
		}
		
		
		
	}
	
	

}
