package org.home.BasicDS;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	
	private List<Integer> elements = new ArrayList<Integer>();
	
	public void push(int newElement){
		elements.add(newElement);
	}
	
	public Integer pop(){
		return elements.remove(elements.size()-1);
	}
	
	public Integer peek(){
		return elements.get(elements.size()-1);
	}
	
	public boolean isEmpty(){
		return elements.size() == 0;
	}

}
