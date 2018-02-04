package com.home.algorithms.general;

public class MinMax {

	public static int getMaxDiff(int[] a){
		Integer min = Integer.MAX_VALUE;
		Integer max = Integer.MIN_VALUE;
		for(int i =0;i<a.length;i++){
			if(a[i]<min){
				min = a[i];
			}
			if(a[i]>max){
				max = a[i];
			}
		}
		return max-min;
	}
	
	public static void main(String args[]){
		System.out.println(MinMax.getMaxDiff(new int[]{2, 3, 10, 6, 4, 8, 1}));
		
	}
}
