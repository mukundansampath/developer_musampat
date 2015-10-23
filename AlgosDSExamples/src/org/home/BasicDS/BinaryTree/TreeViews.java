package org.home.BasicDS.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.home.BasicDS.BinaryTreeNode;

public class TreeViews {
	
	public static void main(String[] args) {
		new TreeViews().leftView(TreeUtils.constructStandardBinaryTree());
		new TreeViews().leftViewRecursion(TreeUtils.constructStandardBinaryTree());
		
		new TreeViews().rightView(TreeUtils.constructStandardBinaryTree());
		new TreeViews().rightViewRecursion(TreeUtils.constructStandardBinaryTree());

	}

	private void rightViewRecursion(BinaryTreeNode root) {
		int currentLevel = 1;
		BinaryTreeNode currentNode = root;
		List<BinaryTreeNode> rightNodes = new ArrayList<BinaryTreeNode>();
		computeRightNodes(rightNodes, currentNode, currentLevel);
		
		for (BinaryTreeNode binaryTreeNode : rightNodes) {
			System.out.print(binaryTreeNode.getValue()+ ", ");
		}
	}

	private void computeRightNodes(List<BinaryTreeNode> rightNodes,
			BinaryTreeNode currentNode, int currentLevel) {
		if(rightNodes.size() < currentLevel){
			rightNodes.add(currentNode);
		}

		if(currentNode.getRight() != null){
			computeRightNodes(rightNodes, currentNode.getRight(), currentLevel+1);
		}
		if(currentNode.getLeft() != null){
			computeRightNodes(rightNodes, currentNode.getLeft(), currentLevel+1);
		}
		
	}

	private void leftViewRecursion(BinaryTreeNode root) {
		int currentLevel = 1;
		BinaryTreeNode currentNode = root;
		List<BinaryTreeNode> leftNodes = new ArrayList<BinaryTreeNode>();
		computeLeftNodes(leftNodes, currentNode, currentLevel);
		
		for (BinaryTreeNode binaryTreeNode : leftNodes) {
			System.out.print(binaryTreeNode.getValue()+ ", ");
		}
	}

	private void computeLeftNodes(List<BinaryTreeNode> leftNodes, 
			BinaryTreeNode currentNode,	int currentLevel) {
		
		if(leftNodes.size() < currentLevel){
			leftNodes.add(currentNode);
		}

		if(currentNode.getLeft() != null){
			computeLeftNodes(leftNodes, currentNode.getLeft(), currentLevel+1);
		}
		if(currentNode.getRight() != null){
			computeLeftNodes(leftNodes, currentNode.getRight(), currentLevel+1);
		}
	
	}

	private void leftView(BinaryTreeNode root) {

		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(null);
		queue.add(root);
		
		Queue<BinaryTreeNode> currentLevelQueue = new LinkedList<BinaryTreeNode>();
		currentLevelQueue.add(root);

		System.out.println("Left View: ");

		while(!queue.isEmpty()){
			
			BinaryTreeNode currentNode = (BinaryTreeNode)queue.poll();
			
			//End of one level
			if(currentNode == null){
				if(currentLevelQueue.peek() != null){
					System.out.print(((BinaryTreeNode)currentLevelQueue.poll()).getValue()+ ", ");
					currentLevelQueue.clear();
					if(!queue.isEmpty()){
						queue.add(null);
					}
				}
			}
			else{
				if(currentNode.getLeft() != null){
					queue.add(currentNode.getLeft());
					currentLevelQueue.add(currentNode.getLeft());
				}
				
				if(currentNode.getRight() != null){
					queue.add(currentNode.getRight());
					currentLevelQueue.add(currentNode.getRight());
				}
			}
			
		}
		
	}
	
	private void rightView(BinaryTreeNode root) {

		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(null);
		queue.add(root);
		
		Stack<BinaryTreeNode> currentLevelStack = new Stack<BinaryTreeNode>();
		currentLevelStack.push(root);

		System.out.println("Right View: ");

		while(!queue.isEmpty()){
			
			BinaryTreeNode currentNode = (BinaryTreeNode)queue.poll();
			
			//End of one level
			if(currentNode == null){
				if(!currentLevelStack.isEmpty()){
					System.out.print(((BinaryTreeNode)currentLevelStack.pop()).getValue()+ ", ");
					currentLevelStack.clear();
					if(!queue.isEmpty()){
						queue.add(null);
					}
				}
			}
			else{
				if(currentNode.getLeft() != null){
					queue.add(currentNode.getLeft());
					currentLevelStack.push(currentNode.getLeft());
				}
				
				if(currentNode.getRight() != null){
					queue.add(currentNode.getRight());
					currentLevelStack.push(currentNode.getRight());
				}
			}
			
		}
		
	}

}
