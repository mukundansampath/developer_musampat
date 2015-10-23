package org.home.Algos.Graphs;

import org.home.BasicDS.GraphNode;

public class GraphUtil {
	
	public static GraphNode constructRandomGraph(){
		
		/**
		 * 
		 * 	b ------ f ------ c
		 *  | \  	 |        \
		 *  |  \     |		   \
		 *  |	a    |          \
		 *  |   | \  |           \
		 *  e   |  \ |            \
		 *   \  |	 d             h
		 *    \ |
		 *     g
		 */
		
		GraphNode a = new GraphNode("a");
		GraphNode b = new GraphNode("b");
		GraphNode c = new GraphNode("c");
		GraphNode d = new GraphNode("d");
		GraphNode e = new GraphNode("e");
		GraphNode f = new GraphNode("f");
		GraphNode g = new GraphNode("g");
		GraphNode h = new GraphNode("h");
		
		a.addNode(b);
		a.addNode(d);
		a.addNode(g);
		
		b.addNode(a);
		b.addNode(e);
		b.addNode(f);
		
		c.addNode(f);
		c.addNode(h);
		
		d.addNode(a);
		d.addNode(f);
		
		e.addNode(b);
		e.addNode(g);
		
		f.addNode(b);
		f.addNode(c);
		f.addNode(d);
		
		g.addNode(a);
		g.addNode(e);

		h.addNode(c);
		
		return a;
	}

}
