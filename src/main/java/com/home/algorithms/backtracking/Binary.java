package com.home.algorithms.backtracking;

public class Binary {
	private int[] A = new int[3];
	public void Binary(int n){
		if(n<1){
			print(A);
		}
			else{
				A[n-1] = 0;
				Binary(n-1);
				A[n-1] = 1;
				Binary(n-1);
				
			}
		
		
	}
	
	private void print(int[] a2) {
		for(int i =0;i<a2.length;i++){
			System.out.println("*****");
			System.out.println(a2[i]);
			System.out.println("*****");
		}
	}

	public static void main(String args[]){
		Binary b = new Binary();
		b.Binary(3);
	}
}
