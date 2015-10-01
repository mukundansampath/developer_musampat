package org.home.BasicDS;

import java.util.ArrayList;
import java.util.List;

public class Queue {

	private List<Object> elements = new ArrayList<Object>(5);
	
	public void enQueue(int newElement){
		elements.add(newElement);
	}
	
	public Object deQueue(){
		return elements.remove(0);
	}
	
	public boolean isEmpty(){
		return elements.size() == 0;
	}
	
}
