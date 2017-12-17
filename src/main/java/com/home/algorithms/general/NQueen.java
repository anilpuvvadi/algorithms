package com.home.algorithms.general;

public class NQueen {
	
	class Position{
		int row;
		int col;
		Position(int row, int col){
			this.row = row;
			this.col = col;
		}
	}
	
	public Position[] invokeNQueen(int n){
		Position[] positions = new Position[n];
		boolean solution = findNqueenposition(0, n,positions);
		if(solution){
			return positions;
		} 
		
		return null;
	}
	
	private boolean findNqueenposition(int row, int n, Position[] pos) {
		if(row==n){
			return true;
		}
		for(int col =0;col<n;col++){
			boolean issafeplace = true;
			for(int queen=0;queen<row;queen++){
				if(row+col == pos[queen].row + pos[queen].col || row-col ==  pos[queen].row - pos[queen].col || pos[queen].col ==col ){
				issafeplace=false;
				//break;
				}
			}
			if(issafeplace){
				pos[row] = new Position(row,col);
				if(findNqueenposition(row+1,n,pos)){
					return true;
				}
			}
		}
		
		return false;
	}

	public static void main(String args[]){
		NQueen nq = new NQueen();
		Position[] pos =nq.invokeNQueen(6);
		for(int i =0;i<pos.length;i++){
			System.out.println("row"+pos[i].row + ", col" + pos[i].col);
		}
		
	}

}
