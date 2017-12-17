package com.home.algorithms;

import java.util.PriorityQueue;
import java.util.Queue;

public class TwoRobots {

	int r;
	int c;
	int[] rowqueue = { -1, 0, 0, 1 };
	int[] columnqueue = { 0, -1, 1, 0 };
	
	public TwoRobots(int ROW, int COL) {
		this.r = ROW;
		this.c = COL;
	}

	public class Vertex {
		int x;
		int y;

		public Vertex(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public class Queuenode implements Comparable {
		int distance;
		Vertex v;

		public Queuenode() {

		}

		public Queuenode(int distance, Vertex v) {

			this.distance = distance;
			this.v = v;
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	public boolean isValid(int row, int col) {
		if (row >= 0 && col >= 0 && row < r && col < c) {
			return true;
		}
		return false;
	}

	public int BFS(Vertex source, Vertex dest, int[][] matrix) {

		Queue<Queuenode> q = new PriorityQueue<Queuenode>();
		if (dest.x == 0 || dest.y == 0 || dest.x > r) {
			return -1;
		}

		boolean[][] visited = new boolean[r][c];

		q.add(new Queuenode(0, source));
		visited[source.x][source.y]=true;
		while (!q.isEmpty()) {
			Queuenode node = q.peek();
			if (node.v.x == dest.x && node.v.y == dest.y) {
				return node.distance;
			}
			node = q.remove();
			for (int i = 0; i < 4; i++) {
				int temp_row = node.v.x + rowqueue[i];
				int temp_col = node.v.y + columnqueue[i];
				Vertex v = new Vertex(temp_row, temp_col);
				if (isValid(v.x, v.y) && !visited[v.x][v.y]  && matrix[v.x][v.y] == 1) {
					Queuenode newnode = new Queuenode(node.distance + 1, v);
					visited[v.x][v.y] = true;
					q.add(newnode);
				}
			}
		}
		return -1;
	}

	public int invokeBFS(int[][] matrix) {
		return BFS(new Vertex(0,0), new Vertex(r-1,c-1), matrix);
		
	}
	
public static void main(String args[]) {
		
	  MultiProblems.maxprodpair(new int[]{-1, -3, -4, 2, 0, -5} );
		int[][] matrix =  {
		        { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
		        { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1 },
		        { 1, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
		        { 1, 0, 0, 1, 1, 0, 0, 0, 0, 1 },
		        { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
		        { 1, 0, 1, 1, 1, 1, 1, 1, 0, 0 },
		        { 1, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
		        { 1, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
		        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
		    };
		int ROW = matrix.length;
		int COL = matrix[0].length;
		TwoRobots path = new TwoRobots(ROW,COL);
		int shortestpath = path.invokeBFS(matrix);
		System.out.println("shortest path => "+shortestpath);
	}
}
