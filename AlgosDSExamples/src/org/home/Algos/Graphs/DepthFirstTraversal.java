package org.home.Algos.Graphs;

import org.home.BasicDS.GraphNode;
import org.home.BasicDS.Stack;

public class DepthFirstTraversal {
	
	private Stack<GraphNode> stack = new Stack<GraphNode>();
	
	public static void main(String[] args) {
		GraphNode start = GraphUtil.constructRandomGraph();
		new DepthFirstTraversal().depthFirstTraversal(start);
	}

	private void depthFirstTraversal(GraphNode start) {
		
		stack.push(start);
		System.out.println("Graph DFS: ");
		
		while(!stack.isEmpty()){

			//Get the latest node
			GraphNode currentNode = stack.peek();
			
			if(!currentNode.isVisited()){
				System.out.print(currentNode.getValue()+", ");
				currentNode.setVisited(true);
			}

			boolean allNeighboursVisited = true;
			for (GraphNode neighbourNode : currentNode.getGraphNodes()) {
				if(!neighbourNode.isVisited()){
					allNeighboursVisited = false;
				}
			}
			
			if(allNeighboursVisited){
				stack.pop();
			}
			else{
				for (GraphNode neighbourNode : currentNode.getGraphNodes()) {
					if(!neighbourNode.isVisited()){
						System.out.print(neighbourNode.getValue()+", ");
						stack.push(neighbourNode);
						neighbourNode.setVisited(true);
						break;
					}
				}
			}

		}
		
	}
	
}
