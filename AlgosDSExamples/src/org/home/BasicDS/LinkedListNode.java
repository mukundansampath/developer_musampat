package org.home.BasicDS;

public class LinkedListNode {
	
	private LinkedListNode nextNode;
	private int value;
	
	public LinkedListNode(int value,LinkedListNode next){
		this.nextNode = next;
		this.value = value;
	}
	
	public LinkedListNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(LinkedListNode nextNode) {
		this.nextNode = nextNode;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}	
	
}
