package com.home.algorithms.bfs;

import java.util.LinkedList;

public class BFS {
	
	private LinkedList<Vertex> q;
	
	public BFS(){
		q = new LinkedList<Vertex>();
	}
	
	public void breadthFirstSearch(Vertex root){
		q.add(root);
		while(!q.isEmpty()){
			Vertex v = q.remove();
			System.out.println("vertex => "+ v.getName());
			for (Vertex ver : v.getAdjacentVertices()){
				if(!ver.isVisited()){
					ver.setVisited(true);
					q.add(ver);
				}
			}
		}
	}
	
	public void breadthFirstSearchRecursive(LinkedList<Vertex> q){	
			if(q.isEmpty()){
				return;
			}
			Vertex v = q.remove();
			System.out.println("vertex => "+ v.getName());
			for (Vertex ver : v.getAdjacentVertices()){
				if(!ver.isVisited()){
					ver.setVisited(true);
					q.add(ver);
				}
			}
			breadthFirstSearchRecursive(q);
		}
}
