package org.home.BasicDS;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {
	
	private List<E> elements = new ArrayList<E>();
	
	public void push(E newElement){
		elements.add(newElement);
	}
	
	public E pop(){
		return elements.remove(elements.size()-1);
	}
	
	public E peek(){
		return elements.get(elements.size()-1);
	}
	
	public boolean isEmpty(){
		return elements.size() == 0;
	}

}
