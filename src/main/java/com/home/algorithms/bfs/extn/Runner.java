package com.home.algorithms.bfs.extn;

import java.util.LinkedList;


public class Runner {
	
	public static void main(String args[]){
		
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		Vertex e = new Vertex("E");
		Vertex f = new Vertex("F");
		
		a.getAdjacentVertices().add(b);
		a.getAdjacentVertices().add(c);
		b.getAdjacentVertices().add(d);
		b.getAdjacentVertices().add(e);
	
		a.setVisited(false);
		b.setVisited(false);
		c.setVisited(false);
		d.setVisited(false);
		e.setVisited(false);
		PathBetweenNodes pbn = new PathBetweenNodes();
		System.out.println("route exists =>" +pbn.routeexists(a,e));
		
	}

}
