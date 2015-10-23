package org.home.Algos.LinkedList;

import org.home.BasicDS.LinkedListNode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedListNode five = new LinkedListNode(5, null);
		LinkedListNode four = new LinkedListNode(4, five);
		LinkedListNode three = new LinkedListNode(3, four);
		LinkedListNode two = new LinkedListNode(2, three);
		LinkedListNode one = new LinkedListNode(1, two);
		
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		LinkedListNode reverseHead = reverseLinkedList.reverseListInteration(one);
		while(reverseHead != null){
			System.out.print(reverseHead.getValue()+", ");
			reverseHead = reverseHead.getNextNode();
		}
		
		System.out.println("--------------------");

		//Reverse recursively
		five.setNextNode(null);
		four.setNextNode(five);
		three.setNextNode(four);
		two.setNextNode(three);
		one.setNextNode(two);
		
		reverseHead = reverseLinkedList.reverseList(one);
		while(reverseHead != null){
			System.out.print(reverseHead.getValue()+", ");
			reverseHead = reverseHead.getNextNode();
		}
	}

	private LinkedListNode reverseList(LinkedListNode root) {
		
		if(root == null){
			return null;
		}
		
		if(root.getNextNode() == null){
			return root;
		}
		
		LinkedListNode nextNode = root.getNextNode();
		LinkedListNode reversedNode = reverseList(nextNode);
		nextNode.setNextNode(root);
		root.setNextNode(null);
		
		return reversedNode;
				
	}

	private LinkedListNode reverseListInteration(LinkedListNode root) {

		LinkedListNode prev = null;
		LinkedListNode current = root;
		
		if(root == null){
			return null;
		}
		
		while(current!= null){

			LinkedListNode next = current.getNextNode();

			current.setNextNode(prev);
			prev = current;
			
			//End of the list
			if(next == null){
				return current;
			}
			
			current = next;
			
		}
		
		return prev;

	}
	
}
