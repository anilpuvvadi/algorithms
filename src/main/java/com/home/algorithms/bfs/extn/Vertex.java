package com.home.algorithms.bfs.extn;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private List<Vertex> adjacentVertices;

	public Vertex(String name) {
		this.name = name;
		this.adjacentVertices = new ArrayList<Vertex>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
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
	
	public String toString(){
		return this.name;
	}
}
