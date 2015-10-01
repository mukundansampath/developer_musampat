package org.home.BasicDS;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	
	private List<Object> elements = new ArrayList<Object>();
	
	public void push(Object newElement){
		elements.add(newElement);
	}
	
	public Object pop(){
		return elements.remove(elements.size()-1);
	}
	
	public Object peek(){
		return elements.get(elements.size()-1);
	}
	
	public boolean isEmpty(){
		return elements.size() == 0;
	}

}
