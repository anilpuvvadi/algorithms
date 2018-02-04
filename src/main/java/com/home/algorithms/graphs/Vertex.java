package com.home.algorithms.graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private int value;
	private List<Vertex> adjacentVertices;
	private int indegree=0;

	public Vertex(int value){
		this.setValue(value);
		adjacentVertices = new ArrayList<Vertex>();
	}

	public List<Vertex> getAdjacentVertices() {
		return adjacentVertices;
	}

	public void addVertex(Vertex v) {
		this.adjacentVertices.add(v);
	}

	public void setAdjacentVertices(List<Vertex> adjacentVertices) {
		this.adjacentVertices = adjacentVertices;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void incrementIndegree() {
		this.indegree++;
	}
	
	public void decrementIndegree() {
		 this.indegree--;
	}

	public int getIndegree() {
		return this.indegree;
	}
	public void setIndegree(int indegree) {
		this.indegree = indegree;
	}
	
}
