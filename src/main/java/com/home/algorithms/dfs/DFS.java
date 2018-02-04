package com.home.algorithms.dfs;

import java.util.Stack;

public class DFS {
	
	private Stack<Vertex> stack;
	public DFS(){
		stack = new Stack<Vertex>();
	}
	
	public void depthFirstSearch(Vertex root){
		if(root == null){
			return;
		}
		stack.push(root);
		while(!stack.isEmpty()){			
			Vertex v = stack.pop();
			System.out.println("vertex =>"+v.getName());
			for(Vertex ver: v.getAdjacentVertices()){
				if(!ver.isVisited()){
					stack.push(ver);
					ver.setVisited(true);
				}
			}
		}
	}

	public void depthFirstSearchRec(Vertex v){
		if(v == null){
			return;
		}
		System.out.println("vertex =>"+v.getName());
		for(Vertex ver: v.getAdjacentVertices()){
			if(!ver.isVisited()){
				ver.setVisited(true);
				depthFirstSearchRec(ver);
			}
		}
	}
}
