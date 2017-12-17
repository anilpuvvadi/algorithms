package com.home.algorithms.dfs.extn;

public class ConnectedGraphsCount {

	private int M;
	private int N;
	private boolean[][] visited;
	private int[] xaxis = new int[] {-1,-1,-1,0,0,1,1,1};
	private int[] yaxis = new int[] {-1,0,1,-1,1,-1,0,1};
	
	public ConnectedGraphsCount(int matrix[][]){
		this.M = matrix.length;
		this.N = matrix[0].length;
		visited = new boolean[M][N];
	}
	
	public void DFS(int matrix[][], int i, int j){
		visited[i][j] = true;
		for( int k =0; k<xaxis.length;k++){
			int new_row = i + xaxis[k];
			int new_col = j + yaxis[k];
			if(issafe(new_row,new_col) && matrix[new_row][new_col]==1 && !visited[new_row][new_col]){
				DFS(matrix,new_row,new_col);
			}
		}
	}
	
	private boolean issafe(int new_row, int new_col) {
		if(new_row>=0 && new_row<M && new_col>=0 && new_col<N){
			return true;
		}
		return false;
	}

	public int getConnectedGraphCount(int[][] matrix){
		int cgcount = 0;
		for( int i=0;i<M;i++){
			for( int j=0;j<N;j++){
				if(matrix[i][j]==1 && !visited[i][j]){
					cgcount++;
					DFS(matrix,i,j);
				}
			}
		}
		return cgcount;
	}
	
	
	public static void main(String args[]){
		
		int[][] matrix = new int[][]{
				{1, 1, 1, 1, 1},
                {0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1}};
		ConnectedGraphsCount cg = new ConnectedGraphsCount(matrix);
		System.out.println("No. of connected graphs => "+cg.getConnectedGraphCount(matrix));
	}
}
