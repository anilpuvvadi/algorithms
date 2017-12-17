package com.home.algorithms.bfs;

import java.util.LinkedList;


public class Runner {
	
	public static void main(String args[]){
		
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		Vertex e = new Vertex("E");
		
		a.getAdjacentVertices().add(b);
		a.getAdjacentVertices().add(c);
		b.getAdjacentVertices().add(d);
		b.getAdjacentVertices().add(e);
	
		BFS bfs = new BFS();
		System.out.println("***********BFS Recursive*********");
		LinkedList<Vertex> ll = new LinkedList<Vertex>();
		ll.add(a);
		bfs.breadthFirstSearchRecursive(ll);
		
		System.out.println("***********BFS Iterative*********");
		
		a.setVisited(false);
		b.setVisited(false);
		c.setVisited(false);
		d.setVisited(false);
		e.setVisited(false);	
		bfs.breadthFirstSearch(a);
		
	}

}
