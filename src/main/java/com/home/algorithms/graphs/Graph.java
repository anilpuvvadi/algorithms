package com.home.algorithms.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

	private ArrayList<Vertex> vertexList;
	int count =0;
	public Graph(int V){
		vertexList = new ArrayList<Vertex>(V);
		for(int i=0;i<V;i++){
			Vertex v = new Vertex(i);
			vertexList.add(v);
		}
	}
	public void addEdge( int u, int v){
		vertexList.get(u).getAdjacentVertices().add(new Vertex(v));
		vertexList.get(v).incrementIndegree();
	}
	public void topologicalSort() {
		LinkedList<Vertex> q = new LinkedList<Vertex>();
		for(Vertex ver : vertexList){
			if(ver.getIndegree()==0){
				q.add(ver);
			}
		}
		while(!q.isEmpty()){
			Vertex v = q.remove();
			System.out.println(v.getValue()+", ");
			for(Vertex ver:vertexList.get(v.getValue()).getAdjacentVertices()){
				vertexList.get(ver.getValue()).decrementIndegree();
				if(vertexList.get(ver.getValue()).getIndegree()==0){
					q.add(ver);
				}
			}
			count++;
		}
		
		if(count!=vertexList.size()){
			System.out.println("There exists a cycle in the graph");
		}
	}
	
	
}
