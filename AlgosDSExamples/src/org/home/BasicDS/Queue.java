package org.home.BasicDS;

import java.util.ArrayList;
import java.util.List;

public class Queue {

	private List<Integer> elements = new ArrayList<Integer>(5);
	
	public void enQueue(int newElement){
		elements.add(newElement);
	}
	
	public Integer deQueue(){
		return elements.remove(0);
	}
	
	public boolean isEmpty(){
		return elements.size() == 0;
	}
	
}
