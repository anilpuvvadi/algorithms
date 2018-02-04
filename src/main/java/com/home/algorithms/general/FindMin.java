package com.home.algorithms.general;

public class FindMin {

	int findMin(int a[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static void main(String args[]) {

		FindMin fm = new FindMin();
		System.out.println(" "+fm.findMin(new int[]{3,6,100,-4,1}));
	}
}
