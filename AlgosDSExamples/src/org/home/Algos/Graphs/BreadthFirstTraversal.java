package org.home.Algos.Graphs;

import org.home.BasicDS.GraphNode;
import org.home.BasicDS.Queue;

public class BreadthFirstTraversal {
	
	private Queue<GraphNode> queue = new Queue<GraphNode>();
	
	public static void main(String[] args) {
		GraphNode start = GraphUtil.constructRandomGraph();
		new BreadthFirstTraversal().breadthFirstTraversal(start);
	}
	
	private void breadthFirstTraversal(GraphNode start) {
		System.out.println("Graph BFS: ");
		queue.enQueue(start);
		
		while(!queue.isEmpty()){
			
			GraphNode currentNode = (GraphNode) queue.deQueue();

			if(!currentNode.isVisited()){
				System.out.print(currentNode.getValue()+", ");
				currentNode.setVisited(true);
			}
			
			//Add all the vertices that are connected to 
			for (GraphNode neighbourNode : currentNode.getGraphNodes()) {
				if(!neighbourNode.isVisited()){
					System.out.print(neighbourNode.getValue()+", ");
					queue.enQueue(neighbourNode);
					neighbourNode.setVisited(true);
				}
			}
		}
	}

}
