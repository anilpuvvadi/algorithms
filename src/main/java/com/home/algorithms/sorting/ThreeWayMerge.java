package com.home.algorithms.sorting;


public class ThreeWayMerge {
	
	public int[] merge(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
		int[] T = new int[m+n];
		int i =0;
		int j =0;
		int k =0;
		while(i<m && j<n){
			if(a[i]<b[j]){
				T[k++] = a[i++];
			} else {
				T[k++] = b[j++];
			}	
		}
		while(i<m){
			T[k++] = a[i++];
		}
		while(j<n){
			T[k++] = b[j++];
		}
		return T;
	}
	
	//Time Complexity O(m+n+o) - size of 3 arrays
	//Space Complexity O(m+n) - at a time 2 arrays are required
	
	public static void main(String args[]){
			ThreeWayMerge th = new ThreeWayMerge();
			int[] A = new int[]{ 1, 2, 3, 5 };
		    int[] B = { 6, 7, 8, 9 };
		    int[] C = { 10, 11, 12 };
		    int[] T = th.merge(A, B);		 
		    printArray(th.merge(T, C));
	}

	private static void printArray(int[] merge) {
		
		for(int i =0;i<merge.length;i++){
			System.out.println(merge[i]);
		}
	}

	

}
