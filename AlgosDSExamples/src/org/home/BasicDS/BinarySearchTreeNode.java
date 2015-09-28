package org.home.BasicDS;

public class BinarySearchTreeNode {
	
	private BinarySearchTreeNode left;
	private BinarySearchTreeNode right;
	private int value;

	public BinarySearchTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinarySearchTreeNode left) {
		this.left = left;
	}
	
	public BinarySearchTreeNode getRight() {
		return right;
	}
	public void setRight(BinarySearchTreeNode right) {
		this.right = right;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
