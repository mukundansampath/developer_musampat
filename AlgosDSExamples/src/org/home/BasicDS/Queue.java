package org.home.BasicDS;

import java.util.ArrayList;
import java.util.List;

public class Queue<E> {

	private List<E> elements = new ArrayList<E>(5);
	
	public void enQueue(E newElement){
		elements.add(newElement);
	}
	
	public E deQueue(){
		return elements.remove(0);
	}
	
	public boolean isEmpty(){
		return elements.size() == 0;
	}
	
}
