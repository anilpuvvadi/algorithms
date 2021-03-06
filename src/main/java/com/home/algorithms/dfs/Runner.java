package com.home.algorithms.dfs;



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
		

		System.out.println("***********DFS Recursive*********");
		
		DFS dfs = new DFS();
		dfs.depthFirstSearchRec(a);
		
		a.setVisited(false);
		b.setVisited(false);
		c.setVisited(false);
		d.setVisited(false);
		e.setVisited(false);
		
		System.out.println("***********DFS Iterative*********");
		
		dfs.depthFirstSearch(a);
		
		a.setVisited(false);
		b.setVisited(false);
		c.setVisited(false);
		d.setVisited(false);
		e.setVisited(false);
	}

}
