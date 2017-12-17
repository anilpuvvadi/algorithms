package com.home.algorithms.dfs.extn;

public class LargestConnectGraph {

	private int[][] matrix;
	private boolean[][] visited;
	private int[] xaxis = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
	private int[] yaxis = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
	private int M;
	private int N;

	public LargestConnectGraph(int[][] matrix) {
		this.matrix = matrix;
		this.M = matrix.length;
		this.N = matrix[0].length;
		this.visited = new boolean[M][N];

	}

	public int getLargestConnectedGraph() {
		int count = 0;
		int max_count =0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1 && !visited[i][j]) {
					count = dfs(matrix, i,j);
					if(count > max_count){
						max_count = count;
					}
				}
			}
		}
		return max_count;
	}

	private int dfs(int[][] matrix, int i, int j) {
		visited[i][j] = true;
		int size =1;
		for (int x = 0; x < xaxis.length; x++) {
			if (i + xaxis[x] >=0 &&  i + xaxis[x] < M && j + yaxis[x]>=0 && j + yaxis[x] < N
					&& matrix[i + xaxis[x]][j + yaxis[x]] == 1
					&& !visited[i + xaxis[x]][j + yaxis[x]]) {
				size += dfs(matrix, i + xaxis[x], j+yaxis[x]);
			}
		}
		return size;
	}

	public static void main(String args[]) {
		
		int[][] matrix = new int[][]{
				{1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};
		LargestConnectGraph cg = new LargestConnectGraph(matrix);
		System.out.println("Largest connected graph => "+cg.getLargestConnectedGraph());

	}
}
