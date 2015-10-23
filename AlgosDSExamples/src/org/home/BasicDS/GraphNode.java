package org.home.BasicDS;

import java.util.HashSet;
import java.util.Set;

public class GraphNode {
	
	private Set<GraphNode> graphNodes = new HashSet<GraphNode>();
	private String value;
	
	public GraphNode(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public void addNode(GraphNode graphNode){
		this.graphNodes.add(graphNode);
	}
	
	public Set<GraphNode> getGraphNodes() {
		return graphNodes;
	}

}
